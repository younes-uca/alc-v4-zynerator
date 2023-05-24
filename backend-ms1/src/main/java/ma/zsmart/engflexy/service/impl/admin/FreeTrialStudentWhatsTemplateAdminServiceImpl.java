package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.FreeTrialStudentWhatsTemplate;
import ma.zsmart.engflexy.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.FreeTrialStudentWhatsTemplateDao;
import ma.zsmart.engflexy.dao.facade.history.FreeTrialStudentWhatsTemplateHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.FreeTrialStudentWhatsTemplateSpecification;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialStudentWhatsTemplateAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialStudentWhatsTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialStudentWhatsTemplate,FreeTrialStudentWhatsTemplateHistory, FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateDao,
FreeTrialStudentWhatsTemplateHistoryDao> implements FreeTrialStudentWhatsTemplateAdminService {






    public void configure() {
        super.configure(FreeTrialStudentWhatsTemplate.class,FreeTrialStudentWhatsTemplateHistory.class, FreeTrialStudentWhatsTemplateHistoryCriteria.class, FreeTrialStudentWhatsTemplateSpecification.class);
    }


    public FreeTrialStudentWhatsTemplateAdminServiceImpl(FreeTrialStudentWhatsTemplateDao dao, FreeTrialStudentWhatsTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}