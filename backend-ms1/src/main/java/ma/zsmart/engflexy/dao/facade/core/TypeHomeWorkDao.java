package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.TypeHomeWork;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.TypeHomeWork;
import java.util.List;


@Repository
public interface TypeHomeWorkDao extends AbstractRepository<TypeHomeWork,Long>  {
    TypeHomeWork findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeHomeWork(item.id,item.lib) FROM TypeHomeWork item")
    List<TypeHomeWork> findAllOptimized();
}
