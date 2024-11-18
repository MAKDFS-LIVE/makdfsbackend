package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.InvestmentRepository;
import medlyfechemist.com.medlyfechemist.entites.Investment;


@Component
public class InvestmentService {
    @Autowired
    private InvestmentRepository investmentRepository;
    
    public Investment addUsers(Investment b){
        Investment result = investmentRepository.save(b);
        return result;
    }

    public List<Investment> userWallet(String uid){
        List<Investment> list =  (List<Investment>) this.investmentRepository.findAllByUseridOrderByIdDesc(uid);
        return list;
    }

}
