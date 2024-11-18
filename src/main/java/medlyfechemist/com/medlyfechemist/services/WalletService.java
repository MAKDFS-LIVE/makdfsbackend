package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import medlyfechemist.com.medlyfechemist.dao.WalletRepository;
import medlyfechemist.com.medlyfechemist.entites.Wallet;

@Component
public class WalletService {
    @Autowired
    private WalletRepository walletRepository;
    
    public Wallet addUsers(Wallet b){
        Wallet result = walletRepository.save(b);
        return result;
    }

    public List<Wallet> userWallet(String uid){
        List<Wallet> list =  (List<Wallet>) this.walletRepository.findByUserid(uid);
        return list;
    }
    
    public Wallet walletPresent(String userid,String curency){
        Wallet users=null;
        try{users = this.walletRepository.findAllByUseridAndCurency(userid, curency);}
        catch(Exception e){e.printStackTrace();}
        return users;
    }

    
    public Wallet walletBeforeThis(String userid){
        Wallet users=null;
        try{users = this.walletRepository.findAllByUserid(userid);}
        catch(Exception e){e.printStackTrace();}
        return users;
    }
}
