package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.zsmart.engflexy.bean.history.EtudiantCoursHistory;


public class EtudiantCoursHistorySpecification extends AbstractHistorySpecification<EtudiantCoursHistoryCriteria, EtudiantCoursHistory> {

    public EtudiantCoursHistorySpecification(EtudiantCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantCoursHistorySpecification(EtudiantCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
