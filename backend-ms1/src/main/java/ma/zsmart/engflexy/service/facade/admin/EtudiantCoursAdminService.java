package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.EtudiantCours;
import ma.zsmart.engflexy.dao.criteria.core.EtudiantCoursCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface EtudiantCoursAdminService extends  IService<EtudiantCours,EtudiantCoursCriteria, EtudiantCoursHistoryCriteria>  {

    List<EtudiantCours> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<EtudiantCours> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<EtudiantCours> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
