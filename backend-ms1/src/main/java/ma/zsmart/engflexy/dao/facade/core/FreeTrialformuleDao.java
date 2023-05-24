package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.FreeTrialformule;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.FreeTrialformule;
import java.util.List;


@Repository
public interface FreeTrialformuleDao extends AbstractRepository<FreeTrialformule,Long>  {
    FreeTrialformule findByCode(String code);
    int deleteByCode(String code);

    List<FreeTrialformule> findByInscriptionId(Long id);
    int deleteByInscriptionId(Long id);

    @Query("SELECT NEW FreeTrialformule(item.id,item.code) FROM FreeTrialformule item")
    List<FreeTrialformule> findAllOptimized();
}
