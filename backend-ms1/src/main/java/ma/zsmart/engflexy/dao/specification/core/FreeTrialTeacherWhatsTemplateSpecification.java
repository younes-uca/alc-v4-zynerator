package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialTeacherWhatsTemplateCriteria;
import ma.zsmart.engflexy.bean.core.FreeTrialTeacherWhatsTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FreeTrialTeacherWhatsTemplateSpecification extends  AbstractSpecification<FreeTrialTeacherWhatsTemplateCriteria, FreeTrialTeacherWhatsTemplate>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(),criteria.getObjectLike());
        addPredicate("source", criteria.getSource(),criteria.getSourceLike());
    }

    public FreeTrialTeacherWhatsTemplateSpecification(FreeTrialTeacherWhatsTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherWhatsTemplateSpecification(FreeTrialTeacherWhatsTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
