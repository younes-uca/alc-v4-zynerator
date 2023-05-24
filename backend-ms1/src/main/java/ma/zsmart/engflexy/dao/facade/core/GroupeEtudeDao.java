package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.GroupeEtude;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface GroupeEtudeDao extends AbstractRepository<GroupeEtude,Long>  {


    @Query("SELECT NEW GroupeEtude(item.id,item.libelle) FROM GroupeEtude item")
    List<GroupeEtude> findAllOptimized();
}
