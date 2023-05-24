package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.GroupeEtudeHistoryCriteria;
import ma.zsmart.engflexy.bean.history.GroupeEtudeHistory;


public class GroupeEtudeHistorySpecification extends AbstractHistorySpecification<GroupeEtudeHistoryCriteria, GroupeEtudeHistory> {

    public GroupeEtudeHistorySpecification(GroupeEtudeHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudeHistorySpecification(GroupeEtudeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
