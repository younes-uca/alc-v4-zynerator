package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.VocabularyHistoryCriteria;
import ma.zsmart.engflexy.bean.history.VocabularyHistory;


public class VocabularyHistorySpecification extends AbstractHistorySpecification<VocabularyHistoryCriteria, VocabularyHistory> {

    public VocabularyHistorySpecification(VocabularyHistoryCriteria criteria) {
        super(criteria);
    }

    public VocabularyHistorySpecification(VocabularyHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
