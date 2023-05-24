package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.NewsHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsHistoryDao extends AbstractHistoryRepository<NewsHistory,Long> {

}
