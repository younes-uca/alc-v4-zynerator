package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.InviteStudentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InviteStudentHistoryDao extends AbstractHistoryRepository<InviteStudentHistory,Long> {

}
