package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.zsmart.engflexy.bean.history.LevelTestConfigurationHistory;


public class LevelTestConfigurationHistorySpecification extends AbstractHistorySpecification<LevelTestConfigurationHistoryCriteria, LevelTestConfigurationHistory> {

    public LevelTestConfigurationHistorySpecification(LevelTestConfigurationHistoryCriteria criteria) {
        super(criteria);
    }

    public LevelTestConfigurationHistorySpecification(LevelTestConfigurationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
