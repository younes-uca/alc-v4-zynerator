package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.ReclamationEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface ReclamationEtudiantAdminService extends  IService<ReclamationEtudiant,ReclamationEtudiantCriteria, ReclamationEtudiantHistoryCriteria>  {

    List<ReclamationEtudiant> findByTypeReclamationEtudiantId(Long id);
    int deleteByTypeReclamationEtudiantId(Long id);



}
