package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.EtudiantCoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantCoursHistoryDao extends AbstractHistoryRepository<EtudiantCoursHistory,Long> {

}
