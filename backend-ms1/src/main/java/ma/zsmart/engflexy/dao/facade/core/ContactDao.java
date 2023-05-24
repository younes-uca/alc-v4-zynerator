package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import ma.zsmart.engflexy.bean.core.Contact;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ContactDao extends AbstractRepository<Contact,Long>  {


}
