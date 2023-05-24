package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.ReponseHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseHistoryDao extends AbstractHistoryRepository<ReponseHistory,Long> {

}
