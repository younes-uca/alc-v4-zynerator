package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.ClassAverageBonusProfCriteria;
import ma.zsmart.engflexy.bean.core.ClassAverageBonusProf;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ClassAverageBonusProfSpecification extends  AbstractSpecification<ClassAverageBonusProfCriteria, ClassAverageBonusProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("mois", criteria.getMois(), criteria.getMoisMin(), criteria.getMoisMax());
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("salary","id", criteria.getSalary()==null?null:criteria.getSalary().getId());
        addPredicateFk("salary","id", criteria.getSalarys());
        addPredicateFk("salary","code", criteria.getSalary()==null?null:criteria.getSalary().getCode());
    }

    public ClassAverageBonusProfSpecification(ClassAverageBonusProfCriteria criteria) {
        super(criteria);
    }

    public ClassAverageBonusProfSpecification(ClassAverageBonusProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
