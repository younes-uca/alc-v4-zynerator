package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.FaqProf;
import ma.zsmart.engflexy.dao.criteria.core.FaqProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FaqProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface FaqProfAdminService extends  IService<FaqProf,FaqProfCriteria, FaqProfHistoryCriteria>  {

    List<FaqProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<FaqProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqProf> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
