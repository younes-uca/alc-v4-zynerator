package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.TypeHomeWorkHistoryCriteria;
import ma.zsmart.engflexy.bean.history.TypeHomeWorkHistory;


public class TypeHomeWorkHistorySpecification extends AbstractHistorySpecification<TypeHomeWorkHistoryCriteria, TypeHomeWorkHistory> {

    public TypeHomeWorkHistorySpecification(TypeHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeHomeWorkHistorySpecification(TypeHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
