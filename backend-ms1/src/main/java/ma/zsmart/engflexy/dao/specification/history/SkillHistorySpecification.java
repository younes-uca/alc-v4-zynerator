package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.SkillHistoryCriteria;
import ma.zsmart.engflexy.bean.history.SkillHistory;


public class SkillHistorySpecification extends AbstractHistorySpecification<SkillHistoryCriteria, SkillHistory> {

    public SkillHistorySpecification(SkillHistoryCriteria criteria) {
        super(criteria);
    }

    public SkillHistorySpecification(SkillHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
