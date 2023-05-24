package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.ReponseHistoryCriteria;
import ma.zsmart.engflexy.bean.history.ReponseHistory;


public class ReponseHistorySpecification extends AbstractHistorySpecification<ReponseHistoryCriteria, ReponseHistory> {

    public ReponseHistorySpecification(ReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseHistorySpecification(ReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
