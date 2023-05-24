package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.Quiz;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.Quiz;
import java.util.List;


@Repository
public interface QuizDao extends AbstractRepository<Quiz,Long>  {
    Quiz findByRef(String ref);
    int deleteByRef(String ref);

    List<Quiz> findBySectionId(Long id);
    int deleteBySectionId(Long id);

    @Query("SELECT NEW Quiz(item.id,item.lib) FROM Quiz item")
    List<Quiz> findAllOptimized();
}
