package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.TypeTeacher;
import ma.zsmart.engflexy.bean.history.TypeTeacherHistory;
import ma.zsmart.engflexy.dao.criteria.core.TypeTeacherCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TypeTeacherHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.TypeTeacherDao;
import ma.zsmart.engflexy.dao.facade.history.TypeTeacherHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.TypeTeacherSpecification;
import ma.zsmart.engflexy.service.facade.admin.TypeTeacherAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeTeacherAdminServiceImpl extends AbstractServiceImpl<TypeTeacher,TypeTeacherHistory, TypeTeacherCriteria, TypeTeacherHistoryCriteria, TypeTeacherDao,
TypeTeacherHistoryDao> implements TypeTeacherAdminService {


    public TypeTeacher findByReferenceEntity(TypeTeacher t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeTeacher.class,TypeTeacherHistory.class, TypeTeacherHistoryCriteria.class, TypeTeacherSpecification.class);
    }


    public TypeTeacherAdminServiceImpl(TypeTeacherDao dao, TypeTeacherHistoryDao historyDao) {
        super(dao, historyDao);
    }

}