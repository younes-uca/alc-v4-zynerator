package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.HomeWork;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface HomeWorkDao extends AbstractRepository<HomeWork,Long>  {

    List<HomeWork> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<HomeWork> findByTypeHomeWorkId(Long id);
    int deleteByTypeHomeWorkId(Long id);

    @Query("SELECT NEW HomeWork(item.id,item.libelle) FROM HomeWork item")
    List<HomeWork> findAllOptimized();
}
