package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.SuperCategorieSection;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.SuperCategorieSection;
import java.util.List;


@Repository
public interface SuperCategorieSectionDao extends AbstractRepository<SuperCategorieSection,Long>  {
    SuperCategorieSection findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW SuperCategorieSection(item.id,item.libelle) FROM SuperCategorieSection item")
    List<SuperCategorieSection> findAllOptimized();
}
