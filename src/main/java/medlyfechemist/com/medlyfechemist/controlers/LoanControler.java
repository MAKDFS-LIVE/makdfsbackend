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

import medlyfechemist.com.medlyfechemist.entites.Loan;
import medlyfechemist.com.medlyfechemist.services.LoanService;


@RestController
@CrossOrigin()
public class LoanControler {
    @Autowired
    private LoanService loanService;
    @PostMapping("/loan")
    public ResponseEntity<Loan> addIntern(@RequestBody Loan jobs){
        Loan b=null;
        try{
            b=this.loanService.addUsers(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/loan/{uid}")
    public ResponseEntity<List<Loan>> selfPayment(@PathVariable("uid") String uid){
        try{
            List<Loan> list=this.loanService.userWallet(uid);
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
