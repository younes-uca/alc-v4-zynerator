package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.VocabularyQuizHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabularyQuizHistoryDao extends AbstractHistoryRepository<VocabularyQuizHistory,Long> {

}
