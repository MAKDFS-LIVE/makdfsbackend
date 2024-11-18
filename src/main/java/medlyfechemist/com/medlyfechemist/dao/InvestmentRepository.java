package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import medlyfechemist.com.medlyfechemist.entites.Investment;


public interface InvestmentRepository extends CrudRepository<Investment, Long>{
    
    public List<Investment> findAllByUseridOrderByIdDesc(String useridString);
}
