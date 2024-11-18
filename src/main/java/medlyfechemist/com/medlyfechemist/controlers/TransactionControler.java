package medlyfechemist.com.medlyfechemist.controlers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import medlyfechemist.com.medlyfechemist.entites.Transaction;
import medlyfechemist.com.medlyfechemist.services.TransactionService;

@RestController
@CrossOrigin()
public class TransactionControler {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transaction")
    public ResponseEntity<Transaction> addIntern(@RequestBody Transaction jobs){
        Transaction b=null;
        try{
            b=this.transactionService.addUsers(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/transaction/{uid}")
    public ResponseEntity<List<Transaction>> selfPayment(@PathVariable("uid") String uid){
        try{
            List<Transaction> list=this.transactionService.selPayment(uid);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/sellertransaction/{uid}/{status}")
    public ResponseEntity<List<Transaction>> sellerPayment(@PathVariable("uid") String uid,@PathVariable("status") String status){
        try{
            List<Transaction> list=this.transactionService.sellerPayment(uid,status);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/unapproved")
    public ResponseEntity<List<Transaction>> unapproved(){
        try{
            List<Transaction> list=this.transactionService.unapproved();
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/transactionstatus/{status}")
    public ResponseEntity<List<Transaction>> Pending(@PathVariable("status") String status){
        try{
            List<Transaction> list=this.transactionService.Pending(status);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
