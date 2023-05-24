package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.EtatInscription;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.EtatInscription;
import java.util.List;


@Repository
public interface EtatInscriptionDao extends AbstractRepository<EtatInscription,Long>  {
    EtatInscription findByLibelle(String libelle);
    int deleteByLibelle(String libelle);


    @Query("SELECT NEW EtatInscription(item.id,item.libelle) FROM EtatInscription item")
    List<EtatInscription> findAllOptimized();
}
