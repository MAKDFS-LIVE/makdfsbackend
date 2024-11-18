package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import medlyfechemist.com.medlyfechemist.entites.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

    @Query(value = "select (select CONCAT(id,',',name,',',account_no,',',ifsc,',',bank_name,',',baranch_name,',',paytm_no,',',upiid,',',qrcode) from account where id=u.accountid)as accountid,u.* FROM payment u where status='Active' and userid!=:n and (quantity-selled)>:m order by rand()", nativeQuery = true)
    public List<Payment> allPayment(@Param("n") String name,@Param("m") String amount);

    @Query(value = "select * FROM payment u where userid=:n order by status", nativeQuery = true)
    public List<Payment> selPayment(@Param("n") String name);
}
