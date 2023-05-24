package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.Question;
import ma.zsmart.engflexy.dao.criteria.core.QuestionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuestionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface QuestionAdminService extends  IService<Question,QuestionCriteria, QuestionHistoryCriteria>  {

    List<Question> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<Question> findByQuizId(Long id);
    int deleteByQuizId(Long id);
    List<Question> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);



}
