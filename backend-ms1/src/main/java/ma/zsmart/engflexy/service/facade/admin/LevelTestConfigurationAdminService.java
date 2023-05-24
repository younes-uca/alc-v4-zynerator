package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.LevelTestConfiguration;
import ma.zsmart.engflexy.dao.criteria.core.LevelTestConfigurationCriteria;
import ma.zsmart.engflexy.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface LevelTestConfigurationAdminService extends  IService<LevelTestConfiguration,LevelTestConfigurationCriteria, LevelTestConfigurationHistoryCriteria>  {

    List<LevelTestConfiguration> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);



}
