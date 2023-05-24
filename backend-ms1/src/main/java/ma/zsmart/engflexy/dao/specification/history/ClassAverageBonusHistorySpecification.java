package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.ClassAverageBonusHistoryCriteria;
import ma.zsmart.engflexy.bean.history.ClassAverageBonusHistory;


public class ClassAverageBonusHistorySpecification extends AbstractHistorySpecification<ClassAverageBonusHistoryCriteria, ClassAverageBonusHistory> {

    public ClassAverageBonusHistorySpecification(ClassAverageBonusHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassAverageBonusHistorySpecification(ClassAverageBonusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
