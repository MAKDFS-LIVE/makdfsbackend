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

import medlyfechemist.com.medlyfechemist.entites.Other;
import medlyfechemist.com.medlyfechemist.services.OtherService;

@RestController
@CrossOrigin()
public class OtherControler {
    @Autowired
    private OtherService otherService;
    @PostMapping("/other")
    public ResponseEntity<Other> addIntern(@RequestBody Other jobs){
        Other b=null;
        try{
            b=this.otherService.addUsers(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/other/{uid}/{exchange}")
    public ResponseEntity<List<Other>> selfPayment(@PathVariable("uid") String uid,@PathVariable("exchange") String exchange){
        try{
            List<Other> list=this.otherService.userWallet(uid,exchange);
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
