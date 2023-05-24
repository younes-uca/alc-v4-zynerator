package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.EtatEtudiantScheduleCriteria;
import ma.zsmart.engflexy.bean.core.EtatEtudiantSchedule;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EtatEtudiantScheduleSpecification extends  AbstractSpecification<EtatEtudiantScheduleCriteria, EtatEtudiantSchedule>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("couleur", criteria.getCouleur(),criteria.getCouleurLike());
    }

    public EtatEtudiantScheduleSpecification(EtatEtudiantScheduleCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantScheduleSpecification(EtatEtudiantScheduleCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
