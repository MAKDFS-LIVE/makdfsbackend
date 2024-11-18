package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import medlyfechemist.com.medlyfechemist.entites.Account;

public interface AccountRepository extends CrudRepository<Account,Long>{
    public List<Account> findAllByUseridOrderByIdDesc(String userid);
    
    @Query(value = "select * FROM account u where (u.email=:n or u.userid=:n or u.contact=:n)",nativeQuery = true)
    public List<Account> login(@Param("n") String name);
}
