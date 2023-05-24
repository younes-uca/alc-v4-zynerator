package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.FreeTrialConfiguration;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FreeTrialConfigurationDao extends AbstractRepository<FreeTrialConfiguration,Long>  {


}
