package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.ContactHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactHistoryDao extends AbstractHistoryRepository<ContactHistory,Long> {

}
