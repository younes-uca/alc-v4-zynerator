package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.InscriptionHistoryCriteria;
import ma.zsmart.engflexy.bean.history.InscriptionHistory;


public class InscriptionHistorySpecification extends AbstractHistorySpecification<InscriptionHistoryCriteria, InscriptionHistory> {

    public InscriptionHistorySpecification(InscriptionHistoryCriteria criteria) {
        super(criteria);
    }

    public InscriptionHistorySpecification(InscriptionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
