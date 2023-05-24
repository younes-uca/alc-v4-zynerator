package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.LevelTestConfigurationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelTestConfigurationHistoryDao extends AbstractHistoryRepository<LevelTestConfigurationHistory,Long> {

}
