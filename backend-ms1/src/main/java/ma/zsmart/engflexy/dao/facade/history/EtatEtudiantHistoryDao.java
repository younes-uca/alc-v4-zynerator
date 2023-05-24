package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.EtatEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatEtudiantHistoryDao extends AbstractHistoryRepository<EtatEtudiantHistory,Long> {

}
