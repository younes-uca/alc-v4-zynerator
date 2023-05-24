package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.RecommendTeacherHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendTeacherHistoryDao extends AbstractHistoryRepository<RecommendTeacherHistory,Long> {

}
