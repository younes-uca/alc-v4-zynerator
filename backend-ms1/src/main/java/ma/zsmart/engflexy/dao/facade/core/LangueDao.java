package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.Langue;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.Langue;
import java.util.List;


@Repository
public interface LangueDao extends AbstractRepository<Langue,Long>  {
    Langue findByLibelle(String libelle);
    int deleteByLibelle(String libelle);


    @Query("SELECT NEW Langue(item.id,item.libelle) FROM Langue item")
    List<Langue> findAllOptimized();
}
