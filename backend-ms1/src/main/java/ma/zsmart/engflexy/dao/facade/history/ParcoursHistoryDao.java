package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.ParcoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcoursHistoryDao extends AbstractHistoryRepository<ParcoursHistory,Long> {

}
