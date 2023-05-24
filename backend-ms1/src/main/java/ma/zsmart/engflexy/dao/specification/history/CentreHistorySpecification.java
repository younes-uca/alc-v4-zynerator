package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.CentreHistoryCriteria;
import ma.zsmart.engflexy.bean.history.CentreHistory;


public class CentreHistorySpecification extends AbstractHistorySpecification<CentreHistoryCriteria, CentreHistory> {

    public CentreHistorySpecification(CentreHistoryCriteria criteria) {
        super(criteria);
    }

    public CentreHistorySpecification(CentreHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
