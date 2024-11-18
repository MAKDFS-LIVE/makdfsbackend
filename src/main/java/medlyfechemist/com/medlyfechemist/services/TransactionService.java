package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.TransactionRepository;
import medlyfechemist.com.medlyfechemist.entites.Transaction;

@Component
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    
    public Transaction addUsers(Transaction b){
        Transaction result = transactionRepository.save(b);
        return result;
    }

    public List<Transaction> sellerPayment(String uid,String status){
        List<Transaction> list =  (List<Transaction>) this.transactionRepository.sellerPayment(uid,status);
        return list;
    }

    public List<Transaction> selPayment(String uid){
        List<Transaction> list =  (List<Transaction>) this.transactionRepository.selPayment(uid);
        return list;
    }

    
    public List<Transaction> unapproved(){
        List<Transaction> list =  (List<Transaction>) this.transactionRepository.unapproved();
        return list;
    }

    
    public List<Transaction> Pending(String status){
        List<Transaction> list =  (List<Transaction>) this.transactionRepository.Pending(status);
        return list;
    }
}
