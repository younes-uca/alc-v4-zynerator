package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.Price;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PriceDao extends AbstractRepository<Price,Long>  {


    @Query("SELECT NEW Price(item.id,item.lib) FROM Price item")
    List<Price> findAllOptimized();
}
