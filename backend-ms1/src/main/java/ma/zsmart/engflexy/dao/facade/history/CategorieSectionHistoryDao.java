package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.CategorieSectionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieSectionHistoryDao extends AbstractHistoryRepository<CategorieSectionHistory,Long> {

}
