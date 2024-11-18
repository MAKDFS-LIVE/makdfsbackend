package medlyfechemist.com.medlyfechemist.controlers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import medlyfechemist.com.medlyfechemist.entites.Account;
import medlyfechemist.com.medlyfechemist.services.AccountService;

@RestController
@CrossOrigin()
public class AccountControler {
    @Autowired
    private AccountService accountService;

    @PostMapping("/account")
    public ResponseEntity<Account> addIntern(@RequestBody Account jobs){
        Account b=null;
        try{
            b=this.accountService.addUsers(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/account/{uid}")
    public ResponseEntity<List<Account>> SelectBooed(@PathVariable("uid") String uid){
        try{
            List<Account> list=this.accountService.userPresent(uid);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/account/{id}")
    public ResponseEntity<Void> deleteOrganization(@PathVariable("id") Long id){
        try{
            this.accountService.deleteUsers(id);
            return ResponseEntity.ok().build();
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
