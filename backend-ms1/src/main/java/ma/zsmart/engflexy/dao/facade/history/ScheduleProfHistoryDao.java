package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.ScheduleProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleProfHistoryDao extends AbstractHistoryRepository<ScheduleProfHistory,Long> {

}
