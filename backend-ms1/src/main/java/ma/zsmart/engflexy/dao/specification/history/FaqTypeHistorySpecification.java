package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.FaqTypeHistoryCriteria;
import ma.zsmart.engflexy.bean.history.FaqTypeHistory;


public class FaqTypeHistorySpecification extends AbstractHistorySpecification<FaqTypeHistoryCriteria, FaqTypeHistory> {

    public FaqTypeHistorySpecification(FaqTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqTypeHistorySpecification(FaqTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
