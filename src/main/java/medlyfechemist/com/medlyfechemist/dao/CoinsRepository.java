package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import medlyfechemist.com.medlyfechemist.entites.Coins;

public interface CoinsRepository  extends CrudRepository<Coins,Long>{
    
    @Query(value = "select * FROM coins order by market_cap_rank",nativeQuery = true)
    public List<Coins> findAll();
    public List<Coins> findAllByStatus(String id);
    public Coins findBySymbol(String id);
    
}
