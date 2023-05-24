package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.QuizClassRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizClassRoomHistoryDao extends AbstractHistoryRepository<QuizClassRoomHistory,Long> {

}
