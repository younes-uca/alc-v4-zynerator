package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.ResultatHomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultatHomeWorkHistoryDao extends AbstractHistoryRepository<ResultatHomeWorkHistory,Long> {

}
