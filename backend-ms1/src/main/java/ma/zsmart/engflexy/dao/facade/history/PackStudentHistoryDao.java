package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.PackStudentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PackStudentHistoryDao extends AbstractHistoryRepository<PackStudentHistory,Long> {

}
