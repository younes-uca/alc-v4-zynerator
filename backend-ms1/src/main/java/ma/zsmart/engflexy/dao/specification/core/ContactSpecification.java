package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.ContactCriteria;
import ma.zsmart.engflexy.bean.core.Contact;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ContactSpecification extends  AbstractSpecification<ContactCriteria, Contact>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("name", criteria.getName(),criteria.getNameLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicate("phone", criteria.getPhone(),criteria.getPhoneLike());
        addPredicate("setFrom", criteria.getSetFrom(),criteria.getSetFromLike());
        addPredicate("dateContact", criteria.getDateContact(), criteria.getDateContactFrom(), criteria.getDateContactTo());
        addPredicateBool("replied", criteria.getReplied());
    }

    public ContactSpecification(ContactCriteria criteria) {
        super(criteria);
    }

    public ContactSpecification(ContactCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
