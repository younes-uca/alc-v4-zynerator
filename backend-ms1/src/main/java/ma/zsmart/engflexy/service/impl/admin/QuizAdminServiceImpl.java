package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.*;
import ma.zsmart.engflexy.bean.history.QuizHistory;
import ma.zsmart.engflexy.dao.criteria.core.QuizCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuizHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.QuizDao;
import ma.zsmart.engflexy.dao.facade.history.QuizHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.QuizSpecification;
import ma.zsmart.engflexy.service.facade.admin.*;
import ma.zsmart.engflexy.zynerator.enumeration.SectionStatus;
import ma.zsmart.engflexy.zynerator.exception.EntityNotFoundException;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuizAdminServiceImpl extends AbstractServiceImpl<Quiz, QuizHistory, QuizCriteria, QuizHistoryCriteria,
        QuizDao, QuizHistoryDao> implements QuizAdminService {

    private void updateSectionsQuiz(Section section, boolean exist) {
        if (section == null) return;
        section = sectionService.findById(section.getId());
        if (section == null) return;
        section.setQuizExist(exist);
        section.setStatus(exist ? SectionStatus.VALIDATE : SectionStatus.QUIZ_MESSING);
        sectionService.edit(section);
    }

    private void updateSectionsQuiz(Long quizId, boolean exist) {
        Quiz quiz = findById(quizId);
        if (quiz == null) return;
        updateSectionsQuiz(quiz.getSection(), exist);
    }

    private void updateSectionsQuiz(Quiz loadQuiz, Quiz quiz) {
        Section oldSection = loadQuiz.getSection();
        Section newSection = quiz.getSection();

        if (!oldSection.getId().equals(newSection.getId())) {
            updateSectionsQuiz(oldSection, false);
            updateSectionsQuiz(newSection, true);
        }
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Quiz create(Quiz t) {
        super.create(t);
        if (t.getQuestions() != null) {
            t.getQuestions().forEach(element -> {
                element.setQuiz(t);
                questionService.create(element);
            });
        }
        if (t.getQuizEtudiants() != null) {
            t.getQuizEtudiants().forEach(element -> {
                element.setQuiz(t);
                quizEtudiantService.create(element);
            });
        }

        updateSectionsQuiz(t.getSection(), true);

        return t;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public Quiz update(Quiz quiz) {
        Quiz loadedQuiz = findById(quiz.getId());
        if (loadedQuiz == null) {
            throw new EntityNotFoundException("errors.notFound", new String[]{itemClass.getSimpleName(), quiz.getId().toString()});
        } else {
            updateWithAssociatedLists(quiz);
            updateSectionsQuiz(loadedQuiz, quiz);

            loadedQuiz.copyFrom(quiz);

            dao.save(loadedQuiz);
            return loadedQuiz;
        }
    }

    public Quiz findWithAssociatedLists(Long id) {
        Quiz result = dao.findById(id).orElse(null);
        if (result != null && result.getId() != null) {
            result.setQuestions(questionService.findByQuizId(id));
            result.setQuizEtudiants(quizEtudiantService.findByQuizId(id));
        }
        return result;
    }

    @Transactional
    public void deleteAssociatedLists(Long id) {
        questionService.deleteByQuizId(id);
        quizEtudiantService.deleteByQuizId(id);
        updateSectionsQuiz(id, false);
    }


    public void updateWithAssociatedLists(Quiz quiz) {
        if (quiz != null && quiz.getId() != null) {
            List<List<Question>> resultQuestions = questionService.getToBeSavedAndToBeDeleted(questionService.findByQuizId(quiz.getId()), quiz.getQuestions());
            questionService.delete(resultQuestions.get(1));
            ListUtil.emptyIfNull(resultQuestions.get(0)).forEach(e -> e.setQuiz(quiz));
            questionService.update(resultQuestions.get(0), true);
            List<List<QuizEtudiant>> resultQuizEtudiants = quizEtudiantService.getToBeSavedAndToBeDeleted(quizEtudiantService.findByQuizId(quiz.getId()), quiz.getQuizEtudiants());
            quizEtudiantService.delete(resultQuizEtudiants.get(1));
            ListUtil.emptyIfNull(resultQuizEtudiants.get(0)).forEach(e -> e.setQuiz(quiz));
            quizEtudiantService.update(resultQuizEtudiants.get(0), true);
        }
    }

    @Override
    public void deleteById(Long id) {
        Quiz quiz = findById(id);
        if (quiz == null) return;
        Section section = quiz.getSection();
        section.setQuizExist(false);
        section.setStatus(SectionStatus.QUIZ_MESSING);

        dao.deleteById(id);
        sectionService.edit(section);
    }

    @Override
    public void deleteByIdIn(List<Long> ids) {
        if (ids == null || ids.size() == 0) return;
        for (Long id : ids) {
            deleteById(id);
        }
    }

    @Override
    public void delete(Quiz quiz) {
        if (quiz == null) return;
        deleteById(quiz.getId());
    }

    @Override
    public void delete(List<Quiz> quizzes) {
        if (quizzes == null || quizzes.size() == 0) return;
        for (Quiz quiz : quizzes) {
            if (quiz == null) return;
            deleteById(quiz.getId());
        }
    }

    public Quiz findByReferenceEntity(Quiz t) {
        return dao.findByRef(t.getRef());
    }

    public List<Quiz> findBySectionId(Long id) {
        return dao.findBySectionId(id);
    }

    public int deleteBySectionId(Long id) {
        return dao.deleteBySectionId(id);
    }


    public void configure() {
        super.configure(Quiz.class, QuizHistory.class, QuizHistoryCriteria.class, QuizSpecification.class);
    }

    @Autowired
    private QuestionAdminService questionService;
    @Autowired
    private QuizEtudiantAdminService quizEtudiantService;
    @Autowired
    private SectionAdminService sectionService;

    public QuizAdminServiceImpl(QuizDao dao, QuizHistoryDao historyDao) {
        super(dao, historyDao);
    }

}