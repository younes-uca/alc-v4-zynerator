package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.ServicesHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesHistoryDao extends AbstractHistoryRepository<ServicesHistory,Long> {

}
