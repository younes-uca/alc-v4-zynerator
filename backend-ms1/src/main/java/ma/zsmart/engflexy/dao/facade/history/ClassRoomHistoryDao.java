package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.ClassRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomHistoryDao extends AbstractHistoryRepository<ClassRoomHistory,Long> {

}
