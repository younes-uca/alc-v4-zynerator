package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.CategorieProf;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.CategorieProf;
import java.util.List;


@Repository
public interface CategorieProfDao extends AbstractRepository<CategorieProf,Long>  {
    CategorieProf findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW CategorieProf(item.id,item.code) FROM CategorieProf item")
    List<CategorieProf> findAllOptimized();
}
