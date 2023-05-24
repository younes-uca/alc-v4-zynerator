package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.zsmart.engflexy.bean.history.TypeDeQuestionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDeQuestionHistoryDao extends AbstractHistoryRepository<TypeDeQuestionHistory,Long> {

}
