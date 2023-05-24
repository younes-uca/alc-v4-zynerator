package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.zsmart.engflexy.bean.history.FaqEtudiantHistory;


public class FaqEtudiantHistorySpecification extends AbstractHistorySpecification<FaqEtudiantHistoryCriteria, FaqEtudiantHistory> {

    public FaqEtudiantHistorySpecification(FaqEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqEtudiantHistorySpecification(FaqEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
