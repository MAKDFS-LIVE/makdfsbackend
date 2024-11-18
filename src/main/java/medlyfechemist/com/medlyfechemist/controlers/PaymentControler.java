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

import medlyfechemist.com.medlyfechemist.entites.Payment;
import medlyfechemist.com.medlyfechemist.services.PaymentService;

@RestController
@CrossOrigin()
public class PaymentControler {
    @Autowired
    private PaymentService paymentService;
    
    @PostMapping("/payment")
    public ResponseEntity<Payment> addIntern(@RequestBody Payment jobs){
        Payment b=null;
        try{
            b=this.paymentService.addUsers(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/allpayment/{uid}/{amount}")
    public ResponseEntity<List<Payment>> allPayment(@PathVariable("uid") String uid,@PathVariable("amount") String amount){
        try{
            List<Payment> list=this.paymentService.allPayment(uid,amount);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/payment/{uid}")
    public ResponseEntity<List<Payment>> SelectBooed(@PathVariable("uid") String uid){
        try{
            List<Payment> list=this.paymentService.selPayment(uid);
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
