package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;
import ma.zsmart.engflexy.dao.criteria.core.SectionItemCriteria;
import ma.zsmart.engflexy.bean.core.SectionItem;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SectionItemSpecification extends  AbstractSpecification<SectionItemCriteria, SectionItem>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("imageUrl", criteria.getImageUrl(),criteria.getImageUrlLike());
        addPredicate("response", criteria.getResponse(),criteria.getResponseLike());
        addPredicate("transcription", criteria.getTranscription(),criteria.getTranscriptionLike());
        addPredicate("translation", criteria.getTranslation(),criteria.getTranslationLike());
        addPredicate("explanation", criteria.getExplanation(),criteria.getExplanationLike());
        addPredicate("example", criteria.getExample(),criteria.getExampleLike());
        addPredicate("synonyms", criteria.getSynonyms(),criteria.getSynonymsLike());
        addPredicateFk("section","id", criteria.getSection()==null?null:criteria.getSection().getId());
        addPredicateFk("section","id", criteria.getSections());
        addPredicateFk("section","code", criteria.getSection()==null?null:criteria.getSection().getCode());
    }

    public SectionItemSpecification(SectionItemCriteria criteria) {
        super(criteria);
    }

    public SectionItemSpecification(SectionItemCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
