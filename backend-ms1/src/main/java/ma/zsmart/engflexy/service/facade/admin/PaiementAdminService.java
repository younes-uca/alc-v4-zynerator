package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.Paiement;
import ma.zsmart.engflexy.dao.criteria.core.PaiementCriteria;
import ma.zsmart.engflexy.dao.criteria.history.PaiementHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface PaiementAdminService extends  IService<Paiement,PaiementCriteria, PaiementHistoryCriteria>  {

    List<Paiement> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<Paiement> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);



}
