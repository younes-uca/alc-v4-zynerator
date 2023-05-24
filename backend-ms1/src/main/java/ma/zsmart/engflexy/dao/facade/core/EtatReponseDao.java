package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.EtatReponse;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.EtatReponse;
import java.util.List;


@Repository
public interface EtatReponseDao extends AbstractRepository<EtatReponse,Long>  {
    EtatReponse findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatReponse(item.id,item.libelle) FROM EtatReponse item")
    List<EtatReponse> findAllOptimized();
}
