package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.zsmart.engflexy.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.zsmart.engflexy.bean.history.ClassRoomHistory;


public class ClassRoomHistorySpecification extends AbstractHistorySpecification<ClassRoomHistoryCriteria, ClassRoomHistory> {

    public ClassRoomHistorySpecification(ClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassRoomHistorySpecification(ClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
