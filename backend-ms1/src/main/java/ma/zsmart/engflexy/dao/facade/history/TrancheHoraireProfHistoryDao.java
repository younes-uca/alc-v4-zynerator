package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.TrancheHoraireProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TrancheHoraireProfHistoryDao extends AbstractHistoryRepository<TrancheHoraireProfHistory,Long> {

}
