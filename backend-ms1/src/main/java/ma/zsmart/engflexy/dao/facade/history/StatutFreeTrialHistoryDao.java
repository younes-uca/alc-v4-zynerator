package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.StatutFreeTrialHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutFreeTrialHistoryDao extends AbstractHistoryRepository<StatutFreeTrialHistory,Long> {

}
