package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.LoanRepository;
import medlyfechemist.com.medlyfechemist.entites.Loan;

@Component
public class LoanService {
    @Autowired
    private LoanRepository LoanRepository;
    
    public Loan addUsers(Loan b){
        Loan result = LoanRepository.save(b);
        return result;
    }

    public List<Loan> userWallet(String uid){
        List<Loan> list =  (List<Loan>) this.LoanRepository.findAllByUserid(uid);
        return list;
    }
    
    
}
