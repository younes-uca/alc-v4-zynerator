package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.EtudiantReviewHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantReviewHistoryDao extends AbstractHistoryRepository<EtudiantReviewHistory,Long> {

}
