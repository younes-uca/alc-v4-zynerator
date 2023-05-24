package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.FaqProfCriteria;
import ma.zsmart.engflexy.bean.core.FaqProf;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FaqProfSpecification extends  AbstractSpecification<FaqProfCriteria, FaqProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("admin","id", criteria.getAdmin()==null?null:criteria.getAdmin().getId());
        addPredicateFk("admin","id", criteria.getAdmins());
        addPredicateFk("faqType","id", criteria.getFaqType()==null?null:criteria.getFaqType().getId());
        addPredicateFk("faqType","id", criteria.getFaqTypes());
    }

    public FaqProfSpecification(FaqProfCriteria criteria) {
        super(criteria);
    }

    public FaqProfSpecification(FaqProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
