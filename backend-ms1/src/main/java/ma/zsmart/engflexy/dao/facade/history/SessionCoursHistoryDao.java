package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.SessionCoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionCoursHistoryDao extends AbstractHistoryRepository<SessionCoursHistory,Long> {

}
