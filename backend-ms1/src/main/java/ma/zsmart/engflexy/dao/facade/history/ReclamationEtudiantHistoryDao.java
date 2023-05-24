package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.ReclamationEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationEtudiantHistoryDao extends AbstractHistoryRepository<ReclamationEtudiantHistory,Long> {

}
