package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.SectionItemHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionItemHistoryDao extends AbstractHistoryRepository<SectionItemHistory,Long> {

}
