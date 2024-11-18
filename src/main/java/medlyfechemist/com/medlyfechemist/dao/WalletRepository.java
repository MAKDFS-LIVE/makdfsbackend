package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import medlyfechemist.com.medlyfechemist.entites.Wallet;


public interface WalletRepository extends CrudRepository<Wallet, Long>{
    
    public List<Wallet> findByUserid(String useridString);
    public Wallet findAllByUseridAndCurency(String userid,String curency);
    public Wallet findAllByUserid(String userid);
}