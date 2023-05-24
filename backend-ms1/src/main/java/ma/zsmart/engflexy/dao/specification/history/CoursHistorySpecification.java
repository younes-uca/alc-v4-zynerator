package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.CoursHistoryCriteria;
import ma.zsmart.engflexy.bean.history.CoursHistory;


public class CoursHistorySpecification extends AbstractHistorySpecification<CoursHistoryCriteria, CoursHistory> {

    public CoursHistorySpecification(CoursHistoryCriteria criteria) {
        super(criteria);
    }

    public CoursHistorySpecification(CoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
