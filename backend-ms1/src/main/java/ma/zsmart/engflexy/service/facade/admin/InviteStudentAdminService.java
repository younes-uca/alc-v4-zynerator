package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.InviteStudent;
import ma.zsmart.engflexy.dao.criteria.core.InviteStudentCriteria;
import ma.zsmart.engflexy.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface InviteStudentAdminService extends  IService<InviteStudent,InviteStudentCriteria, InviteStudentHistoryCriteria>  {

    List<InviteStudent> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
