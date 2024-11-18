package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import medlyfechemist.com.medlyfechemist.entites.Treadehistry;


public interface TreadehistryRepository extends CrudRepository<Treadehistry,Long>{
     public List<Treadehistry> findAllByUseridAndSymbleOrderByIdDesc(String id,String type);
     public List<Treadehistry> findAllByUseridAndStatusOrderByIdDesc(String id,String type);
     public List<Treadehistry> findAllByUseridOrderByIdDesc(String id);
    
}
