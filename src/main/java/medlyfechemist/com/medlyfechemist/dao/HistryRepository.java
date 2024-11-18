package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import medlyfechemist.com.medlyfechemist.entites.Histry;


public interface HistryRepository extends CrudRepository<Histry,Long>{
     public List<Histry> findAllByStatusOrderByIdDesc(String id);
     public List<Histry> findAllByUseridAndTypeOrderByIdDesc(String id,String type);
     public List<Histry> findAllByUseridOrderByIdDesc(String id);

     @Query(value = "select (select CONCAT(name,',',contact,',',password) from registration where id=h.userid)camount,(select CONCAT(account_no,',',bank_name,',',baranch_name,',',ifsc,',',name,',',payment_type,',',paytm_no,',',qrcode,',',upiid) from account where userid=h.userid LIMIT 1)sponcerid,h.* FROM histry h where type=:n and status=:m and note=:q order by id desc",nativeQuery = true)
     public List<Histry> findAllByTypeAndStatusAndNoteOrderByIdDesc(@Param("n") String type,@Param("m") String status,@Param("q") String note);
}
