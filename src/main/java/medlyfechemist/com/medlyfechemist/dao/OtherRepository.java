package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import medlyfechemist.com.medlyfechemist.entites.Other;


public interface OtherRepository extends CrudRepository<Other, Long>{
    
    public List<Other> findAllByUseridAndExchange(String useridString,String exchange);
}
