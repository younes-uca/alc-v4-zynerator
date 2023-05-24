package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.HomeWorkQuestionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkQuestionHistoryDao extends AbstractHistoryRepository<HomeWorkQuestionHistory,Long> {

}
