package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.zsmart.engflexy.bean.history.ReclamationProfHistory;


public class ReclamationProfHistorySpecification extends AbstractHistorySpecification<ReclamationProfHistoryCriteria, ReclamationProfHistory> {

    public ReclamationProfHistorySpecification(ReclamationProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationProfHistorySpecification(ReclamationProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
