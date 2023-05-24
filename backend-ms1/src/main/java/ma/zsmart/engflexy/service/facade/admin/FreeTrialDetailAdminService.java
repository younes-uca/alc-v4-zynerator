package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.FreeTrialDetail;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialDetailCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface FreeTrialDetailAdminService extends  IService<FreeTrialDetail,FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria>  {

    List<FreeTrialDetail> findByFreeTrialId(Long id);
    int deleteByFreeTrialId(Long id);
    List<FreeTrialDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
