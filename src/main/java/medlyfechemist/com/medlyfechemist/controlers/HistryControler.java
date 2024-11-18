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

import medlyfechemist.com.medlyfechemist.entites.Histry;
import medlyfechemist.com.medlyfechemist.services.HistryService;


@RestController
@CrossOrigin()
public class HistryControler {
    @Autowired
    private HistryService histryService;

    @PostMapping("/histry")
    public ResponseEntity<Histry> addJobs(@RequestBody Histry jobs){
        Histry b=null;
        try{
            b=this.histryService.addHistry(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/histrybystatus/{status}")
    public ResponseEntity<List<Histry>> findBlogByStatus(@PathVariable("status") String status){
        try{
            List<Histry> list=this.histryService.findAllByStatus(status);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/histrybytype/{userid}/{type}")
    public ResponseEntity<List<Histry>> findAllByType(@PathVariable("userid") String userid,@PathVariable("type") String type){
        try{
            List<Histry> list=this.histryService.findAllByType(userid,type);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/histrybyuserid/{status}")
    public ResponseEntity<List<Histry>> findAllByUserid(@PathVariable("status") String status){
        try{
            List<Histry> list=this.histryService.findAllByUserid(status);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/histryforwithdraw/{type}/{status}/{note}")
    public ResponseEntity<List<Histry>> findAllForWithdraw(@PathVariable("type") String type,@PathVariable("status") String status,@PathVariable("note") String note){
        try{
            List<Histry> list=this.histryService.findAllForWithdraw(type,status,note);
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
