package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.TeacherLocalityHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherLocalityHistoryDao extends AbstractHistoryRepository<TeacherLocalityHistory,Long> {

}
