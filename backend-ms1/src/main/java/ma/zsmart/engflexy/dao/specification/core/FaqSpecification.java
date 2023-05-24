package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.FaqCriteria;
import ma.zsmart.engflexy.bean.core.Faq;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FaqSpecification extends  AbstractSpecification<FaqCriteria, Faq>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateFk("faqType","id", criteria.getFaqType()==null?null:criteria.getFaqType().getId());
        addPredicateFk("faqType","id", criteria.getFaqTypes());
    }

    public FaqSpecification(FaqCriteria criteria) {
        super(criteria);
    }

    public FaqSpecification(FaqCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
