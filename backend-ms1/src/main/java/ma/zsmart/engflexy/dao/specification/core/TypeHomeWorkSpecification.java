package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.TypeHomeWorkCriteria;
import ma.zsmart.engflexy.bean.core.TypeHomeWork;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeHomeWorkSpecification extends  AbstractSpecification<TypeHomeWorkCriteria, TypeHomeWork>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("lib", criteria.getLib(),criteria.getLibLike());
    }

    public TypeHomeWorkSpecification(TypeHomeWorkCriteria criteria) {
        super(criteria);
    }

    public TypeHomeWorkSpecification(TypeHomeWorkCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
