package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.QuizEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizEtudiantHistoryDao extends AbstractHistoryRepository<QuizEtudiantHistory,Long> {

}
