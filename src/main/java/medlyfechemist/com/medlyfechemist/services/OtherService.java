package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.OtherRepository;
import medlyfechemist.com.medlyfechemist.entites.Other;

@Component
public class OtherService {
    
    @Autowired
    private OtherRepository otherRepository;
    
    public Other addUsers(Other b){
        Other result = otherRepository.save(b);
        return result;
    }

    public List<Other> userWallet(String uid,String exchange){
        List<Other> list =  (List<Other>) this.otherRepository.findAllByUseridAndExchange(uid,exchange);
        return list;
    }
    
}
