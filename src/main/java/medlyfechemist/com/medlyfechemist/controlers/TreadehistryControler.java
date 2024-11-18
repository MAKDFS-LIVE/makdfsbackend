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

import medlyfechemist.com.medlyfechemist.entites.Treadehistry;
import medlyfechemist.com.medlyfechemist.services.TreadehistryService;

@RestController
@CrossOrigin()
public class TreadehistryControler {
    @Autowired
    private TreadehistryService treadehistryService;

    @PostMapping("/treadehistry")
    public ResponseEntity<Treadehistry> addJobs(@RequestBody Treadehistry jobs){
        Treadehistry b=null;
        try{
            b=this.treadehistryService.addHistry(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/treadehistry/{userid}/{type}")
    public ResponseEntity<List<Treadehistry>> findAllByType(@PathVariable("userid") String userid,@PathVariable("type") String type){
        try{
            List<Treadehistry> list=this.treadehistryService.findAllByType(userid,type);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    
    @GetMapping("/treadehistry/{userid}")
    public ResponseEntity<List<Treadehistry>> findAllByType(@PathVariable("userid") String userid){
        try{
            List<Treadehistry> list=this.treadehistryService.findAllByUserid(userid);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/treadeallhistry/{userid}")
    public ResponseEntity<List<Treadehistry>> findAllByHistry(@PathVariable("userid") String userid){
        try{
            List<Treadehistry> list=this.treadehistryService.findAllByHistry(userid);
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
