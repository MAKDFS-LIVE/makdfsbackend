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

import medlyfechemist.com.medlyfechemist.entites.Coins;
import medlyfechemist.com.medlyfechemist.services.CoinsService;


@RestController
@CrossOrigin()
public class CoinsControler {
    @Autowired
    private CoinsService coinsService;

    @PostMapping("/coins")
    public ResponseEntity<Coins> addJobs(@RequestBody Coins jobs){
        Coins b=null;
        try{
            b=this.coinsService.addCoin(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/coins/{status}")
    public ResponseEntity<List<Coins>> findBlogByStatus(@PathVariable("status") String status){
        try{
            List<Coins> list=this.coinsService.findAllByStatus(status);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/coins")
    public ResponseEntity<List<Coins>> findAllCoin(){
        try{
            List<Coins> list=this.coinsService.findAll();
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/coin/{symble}")
    public ResponseEntity<Coins> findBlogByStatusUrl(@PathVariable("symble") String symble){
        try{
            Coins list=this.coinsService.findBySymble(symble);
            if(list==null){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.of(Optional.of(list));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
