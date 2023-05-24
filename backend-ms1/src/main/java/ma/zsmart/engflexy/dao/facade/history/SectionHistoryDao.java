package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.SectionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionHistoryDao extends AbstractHistoryRepository<SectionHistory,Long> {

}
