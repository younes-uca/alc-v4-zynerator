package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.Admin;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AdminDao extends AbstractRepository<Admin,Long>  {


}
