package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import medlyfechemist.com.medlyfechemist.entites.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long>{
    
    @Query(value = "select (select CONCAT(id,',',name) from registration where id=sellerid)as sellerid,u.* FROM transaction u where userid=:n order by id desc", nativeQuery = true)
    public List<Transaction> selPayment(@Param("n") String name);
    
    @Query(value = "select (select CONCAT(id,',',name) from registration where id=u.userid)as userid,u.* FROM transaction u where sellerid=:n and status=:m order by id desc", nativeQuery = true)
    public List<Transaction> sellerPayment(@Param("n") String name,@Param("m") String status);

    @Query(value = "select (select CONCAT(id,',',name) from registration where id=u.userid)as userid,u.* FROM transaction u where status='Unapproved' order by id desc", nativeQuery = true)
    public List<Transaction> unapproved();

    @Query(value = "select (select CONCAT(id,',',name,',',contact,',',password) from registration where id=u.userid)as userid,(select CONCAT(id,',',name,',',contact,',',password) from registration where id=u.sellerid)as sellerid,u.* FROM transaction u where status=:m order by id desc", nativeQuery = true)
    public List<Transaction> Pending(@Param("m") String status);
}
