package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.EtatCoursHistoryCriteria;
import ma.zsmart.engflexy.bean.history.EtatCoursHistory;


public class EtatCoursHistorySpecification extends AbstractHistorySpecification<EtatCoursHistoryCriteria, EtatCoursHistory> {

    public EtatCoursHistorySpecification(EtatCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatCoursHistorySpecification(EtatCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
