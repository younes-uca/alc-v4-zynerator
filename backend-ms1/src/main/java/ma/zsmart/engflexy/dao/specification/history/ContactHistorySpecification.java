package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.ContactHistoryCriteria;
import ma.zsmart.engflexy.bean.history.ContactHistory;


public class ContactHistorySpecification extends AbstractHistorySpecification<ContactHistoryCriteria, ContactHistory> {

    public ContactHistorySpecification(ContactHistoryCriteria criteria) {
        super(criteria);
    }

    public ContactHistorySpecification(ContactHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
