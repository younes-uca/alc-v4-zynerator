package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialStudentEmailTemplateCriteria;
import ma.zsmart.engflexy.bean.core.FreeTrialStudentEmailTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FreeTrialStudentEmailTemplateSpecification extends  AbstractSpecification<FreeTrialStudentEmailTemplateCriteria, FreeTrialStudentEmailTemplate>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(),criteria.getObjectLike());
        addPredicate("source", criteria.getSource(),criteria.getSourceLike());
    }

    public FreeTrialStudentEmailTemplateSpecification(FreeTrialStudentEmailTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentEmailTemplateSpecification(FreeTrialStudentEmailTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
