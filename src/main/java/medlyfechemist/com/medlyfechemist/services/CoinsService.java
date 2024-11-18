package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.CoinsRepository;
import medlyfechemist.com.medlyfechemist.entites.Coins;

@Component
public class CoinsService {
    @Autowired
    private CoinsRepository coinsRepository;

    public Coins addCoin(Coins b){
        Coins result = coinsRepository.save(b);
        return result;
    }

    public List<Coins> findAll(){
        List<Coins> list = this.coinsRepository.findAll();
        return list;
    }

    public List<Coins> findAllByStatus(String num){
        List<Coins> list = this.coinsRepository.findAllByStatus(num);
        return list;
    }
    
    public Coins findBySymble(String num){
        Coins list = this.coinsRepository.findBySymbol(num);
        return list;
    }

    public void deleteBlog(Long id){
        coinsRepository.deleteById(id);
    }
}
