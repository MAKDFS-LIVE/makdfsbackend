package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import medlyfechemist.com.medlyfechemist.entites.Registration;

public interface RegistrationRepository extends CrudRepository<Registration,Long>{
    public Registration findById(long id);

    public Registration findByUserid(String id);
   
    public Registration findByContact(String contact);

    public Registration findByEmail(String email);

    public Registration findByDeviceId(String id);

    /* @Query(value = "select * FROM registration where (email=:m or contact=:q) LIMIT  1",nativeQuery = true)
    public Registration loginCheck(@Param("m") String email,@Param("n") String contact); */
    
    @Query(value = "select (select sum(usdt_amnt) from loan where userid=u.id and (status='Initiated' or status='Approved'))as loan_wallet ,(select sum(usdt_amnt) from investment where userid=u.id and status='Active')as locked_wallet,IFNULL((select sum(usdt) from treadehistry where userid=u.id and status='Pending'),0)as pending_wallet ,u.* FROM registration u where (u.contact=:n or u.email=:n) and u.password=:m LIMIT  1",nativeQuery = true)
    public Registration login(@Param("n") String name,@Param("m") String contact);

    @Query(value = "select * FROM registration where id!=:n and (email=:m and contact=:q) LIMIT  1",nativeQuery = true)
    public Registration login(@Param("n") Long id,@Param("m") String email,@Param("q") String contact);
    
    @Query(value = "select (select count(id) from registration where usertype='User')id,(select count(id) from registration k where (SELECT count(id) FROM `wallet` where userid=k.id)>0)userid,IFNULL((SELECT sum(wallet) FROM wallet where curency='MAK'),0)password,IFNULL((SELECT sum(mak_amnt) FROM investment where status='Active'),0)as name,IFNULL((SELECT sum(credited_mak) FROM loan where status='Active'),0)as contact,(select count(id) from registration k where (SELECT count(id) FROM loan where userid=k.id and status='Active')>0)email,(select count(id) from registration k where (SELECT count(id) FROM loan where userid=k.id and status='Closed')>0)address,(0)city,IFNULL((SELECT sum(usdamnt) FROM wallet where userid='15993638'),0)state,(0)pin,(0)cuntry,(CONCAT((select count(id) FROM histry h where type='Referral' and status='Pending' and note='Payment requested for withdrawal.'),',',(select count(id) FROM histry h where type='Referral' and status='Approved' and note='Payment has been Credited in your account.'),',',(select count(id) FROM transaction u where status='Pending'),',',(select count(id) FROM help where status='Pending')))locked_wallet, u.* FROM registration u where id=1 LIMIT  1",nativeQuery = true)
    public Registration getDashboard();
    
    @Query(value = "select (select concat(id,',',name) from registration where id=k.sponsor)sponsor,k.* from registration k where usertype='User' order by id desc",nativeQuery = true)
    public List<Registration> getAllUsers();

    @Query(value = "select * from registration k where (SELECT count(id) FROM `wallet` where userid=k.id)>0",nativeQuery = true)
    public List<Registration> getActiveUsers();

    @Query(value = "select * from registration k where (SELECT count(id) FROM loan where userid=k.id)>0",nativeQuery = true)
    public List<Registration> getTotalLoanUsers();

    @Query(value = "select * from registration k where (SELECT count(id) FROM loan where userid=k.id and status=?)>0",nativeQuery = true)
    public List<Registration> getLoanUsers(@Param("n") String status);

}
