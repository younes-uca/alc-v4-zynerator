package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.InscriptionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionHistoryDao extends AbstractHistoryRepository<InscriptionHistory,Long> {

}
