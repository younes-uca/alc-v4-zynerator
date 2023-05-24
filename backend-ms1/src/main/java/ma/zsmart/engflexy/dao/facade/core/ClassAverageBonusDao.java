package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.ClassAverageBonus;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.ClassAverageBonus;
import java.util.List;


@Repository
public interface ClassAverageBonusDao extends AbstractRepository<ClassAverageBonus,Long>  {
    ClassAverageBonus findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW ClassAverageBonus(item.id,item.code) FROM ClassAverageBonus item")
    List<ClassAverageBonus> findAllOptimized();
}
