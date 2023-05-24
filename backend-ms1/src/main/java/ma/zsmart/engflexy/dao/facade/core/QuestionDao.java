package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.Question;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.Question;
import java.util.List;


@Repository
public interface QuestionDao extends AbstractRepository<Question,Long>  {
    Question findByLibelle(String libelle);
    int deleteByLibelle(String libelle);

    List<Question> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<Question> findByQuizId(Long id);
    int deleteByQuizId(Long id);
    List<Question> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);

    @Query("SELECT NEW Question(item.id,item.libelle) FROM Question item")
    List<Question> findAllOptimized();
}
