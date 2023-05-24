package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.FaqTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqTypeHistoryDao extends AbstractHistoryRepository<FaqTypeHistory,Long> {

}
