package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.ScheduleProfHistoryCriteria;
import ma.zsmart.engflexy.bean.history.ScheduleProfHistory;


public class ScheduleProfHistorySpecification extends AbstractHistorySpecification<ScheduleProfHistoryCriteria, ScheduleProfHistory> {

    public ScheduleProfHistorySpecification(ScheduleProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ScheduleProfHistorySpecification(ScheduleProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
