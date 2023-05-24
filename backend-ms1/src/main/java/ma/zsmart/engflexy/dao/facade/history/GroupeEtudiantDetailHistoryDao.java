package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.GroupeEtudiantDetailHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeEtudiantDetailHistoryDao extends AbstractHistoryRepository<GroupeEtudiantDetailHistory,Long> {

}
