package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialTeacherEmailTemplateCriteria;
import ma.zsmart.engflexy.bean.core.FreeTrialTeacherEmailTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FreeTrialTeacherEmailTemplateSpecification extends  AbstractSpecification<FreeTrialTeacherEmailTemplateCriteria, FreeTrialTeacherEmailTemplate>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(),criteria.getObjectLike());
        addPredicate("source", criteria.getSource(),criteria.getSourceLike());
    }

    public FreeTrialTeacherEmailTemplateSpecification(FreeTrialTeacherEmailTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherEmailTemplateSpecification(FreeTrialTeacherEmailTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
