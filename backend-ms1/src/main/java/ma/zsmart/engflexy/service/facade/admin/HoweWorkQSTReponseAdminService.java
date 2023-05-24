package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.HoweWorkQSTReponse;
import ma.zsmart.engflexy.dao.criteria.core.HoweWorkQSTReponseCriteria;
import ma.zsmart.engflexy.dao.criteria.history.HoweWorkQSTReponseHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface HoweWorkQSTReponseAdminService extends  IService<HoweWorkQSTReponse,HoweWorkQSTReponseCriteria, HoweWorkQSTReponseHistoryCriteria>  {

    List<HoweWorkQSTReponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<HoweWorkQSTReponse> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);



}
