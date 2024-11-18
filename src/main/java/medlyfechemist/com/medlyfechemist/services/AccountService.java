package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.AccountRepository;
import medlyfechemist.com.medlyfechemist.entites.Account;

@Component
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    
    public List<Account> userPresent(String contact){
        List<Account> list =  (List<Account>) this.accountRepository.findAllByUseridOrderByIdDesc(contact);
        return list;
    }
    
    public Account addUsers(Account b){
        Account result = accountRepository.save(b);
        return result;
    }
    
    public void deleteUsers(Long bid){
        accountRepository.deleteById(bid);
    }
}
