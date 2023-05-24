package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.EtatInscriptionCriteria;
import ma.zsmart.engflexy.bean.core.EtatInscription;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EtatInscriptionSpecification extends  AbstractSpecification<EtatInscriptionCriteria, EtatInscription>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public EtatInscriptionSpecification(EtatInscriptionCriteria criteria) {
        super(criteria);
    }

    public EtatInscriptionSpecification(EtatInscriptionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
