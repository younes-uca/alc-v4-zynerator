package ma.zsmart.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.PackStudent;
import org.springframework.stereotype.Repository;
import ma.zsmart.engflexy.bean.core.PackStudent;
import java.util.List;


@Repository
public interface PackStudentDao extends AbstractRepository<PackStudent,Long>  {
    PackStudent findByCode(String code);
    int deleteByCode(String code);

    List<PackStudent> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<PackStudent> findByPriceId(Long id);
    int deleteByPriceId(Long id);

    @Query("SELECT NEW PackStudent(item.id,item.libelle) FROM PackStudent item")
    List<PackStudent> findAllOptimized();
}
