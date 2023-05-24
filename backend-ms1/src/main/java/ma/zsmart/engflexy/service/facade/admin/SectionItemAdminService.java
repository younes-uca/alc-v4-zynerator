package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.SectionItem;
import ma.zsmart.engflexy.dao.criteria.core.SectionItemCriteria;
import ma.zsmart.engflexy.dao.criteria.history.SectionItemHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface SectionItemAdminService extends  IService<SectionItem,SectionItemCriteria, SectionItemHistoryCriteria>  {

    List<SectionItem> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
