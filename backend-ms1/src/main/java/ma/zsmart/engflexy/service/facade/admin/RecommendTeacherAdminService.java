package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.RecommendTeacher;
import ma.zsmart.engflexy.dao.criteria.core.RecommendTeacherCriteria;
import ma.zsmart.engflexy.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface RecommendTeacherAdminService extends  IService<RecommendTeacher,RecommendTeacherCriteria, RecommendTeacherHistoryCriteria>  {

    List<RecommendTeacher> findByProfId(Long id);
    int deleteByProfId(Long id);



}
