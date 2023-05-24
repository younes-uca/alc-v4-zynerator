package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.CoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursHistoryDao extends AbstractHistoryRepository<CoursHistory,Long> {

}
