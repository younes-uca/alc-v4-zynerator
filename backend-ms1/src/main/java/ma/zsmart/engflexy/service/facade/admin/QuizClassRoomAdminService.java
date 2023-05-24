package ma.zsmart.engflexy.service.facade.admin;

import java.util.List;
import ma.zsmart.engflexy.bean.core.QuizClassRoom;
import ma.zsmart.engflexy.dao.criteria.core.QuizClassRoomCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface QuizClassRoomAdminService extends  IService<QuizClassRoom,QuizClassRoomCriteria, QuizClassRoomHistoryCriteria>  {

    List<QuizClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<QuizClassRoom> findByQuizId(Long id);
    int deleteByQuizId(Long id);



}
