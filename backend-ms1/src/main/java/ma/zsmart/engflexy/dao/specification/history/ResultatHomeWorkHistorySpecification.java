package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.ResultatHomeWorkHistoryCriteria;
import ma.zsmart.engflexy.bean.history.ResultatHomeWorkHistory;


public class ResultatHomeWorkHistorySpecification extends AbstractHistorySpecification<ResultatHomeWorkHistoryCriteria, ResultatHomeWorkHistory> {

    public ResultatHomeWorkHistorySpecification(ResultatHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public ResultatHomeWorkHistorySpecification(ResultatHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
