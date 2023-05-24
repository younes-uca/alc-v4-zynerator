package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.SalaryHistoryCriteria;
import ma.zsmart.engflexy.bean.history.SalaryHistory;


public class SalaryHistorySpecification extends AbstractHistorySpecification<SalaryHistoryCriteria, SalaryHistory> {

    public SalaryHistorySpecification(SalaryHistoryCriteria criteria) {
        super(criteria);
    }

    public SalaryHistorySpecification(SalaryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
