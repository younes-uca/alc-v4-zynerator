package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.LangueHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LangueHistoryDao extends AbstractHistoryRepository<LangueHistory,Long> {

}
