package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.QuizHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizHistoryDao extends AbstractHistoryRepository<QuizHistory,Long> {

}
