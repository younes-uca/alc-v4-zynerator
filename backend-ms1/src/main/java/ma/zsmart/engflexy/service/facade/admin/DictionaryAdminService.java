package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.Dictionary;
import ma.zsmart.engflexy.dao.criteria.core.DictionaryCriteria;
import ma.zsmart.engflexy.dao.criteria.history.DictionaryHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface DictionaryAdminService extends  IService<Dictionary,DictionaryCriteria, DictionaryHistoryCriteria>  {

    List<Dictionary> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
