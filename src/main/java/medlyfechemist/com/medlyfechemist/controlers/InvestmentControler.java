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

import medlyfechemist.com.medlyfechemist.entites.Investment;
import medlyfechemist.com.medlyfechemist.entites.Wallet;
import medlyfechemist.com.medlyfechemist.services.InvestmentService;
import medlyfechemist.com.medlyfechemist.services.WalletService;


@RestController
@CrossOrigin()
public class InvestmentControler {
    @Autowired
    private InvestmentService investmentService;
    @Autowired
    private WalletService walletService;
    
    @PostMapping("/investment")
    public ResponseEntity<Investment> addIntern(@RequestBody Investment jobs){
        Investment b=null;
        try{
            Wallet makWallet = walletService.walletPresent(jobs.getUserid(),jobs.getCurency());
            if(makWallet!=null){
                makWallet.setWallet((Double.parseDouble(makWallet.getWallet()) - Double.parseDouble(jobs.getMakAmnt()))+"");
                this.walletService.addUsers(makWallet);
            }
            b=this.investmentService.addUsers(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/investment/{uid}")
    public ResponseEntity<List<Investment>> selfPayment(@PathVariable("uid") String uid){
        try{
            List<Investment> list=this.investmentService.userWallet(uid);
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
