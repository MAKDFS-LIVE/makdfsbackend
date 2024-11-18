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

import medlyfechemist.com.medlyfechemist.entites.Blog;
import medlyfechemist.com.medlyfechemist.services.BlogService;

@RestController
@CrossOrigin()
public class BlogControler {
    @Autowired
    private BlogService blogService;

    @PostMapping("/blog")
    public ResponseEntity<Blog> addJobs(@RequestBody Blog jobs){
        Blog b=null;
        try{
            b=this.blogService.addAddress(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/blog/{status}")
    public ResponseEntity<List<Blog>> findBlogByStatus(@PathVariable("status") String status){
        try{
            List<Blog> list=this.blogService.findAllByStatus(status);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/blog")
    public ResponseEntity<List<Blog>> findAllBlog(){
        try{
            List<Blog> list=this.blogService.findAllBlog();
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/blogs/{pid}")
    public ResponseEntity<List<Blog>> findAllBlog(@PathVariable("pid") String pid){
        try{
            List<Blog> list=this.blogService.findAllBlog(pid);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/blogs/{status}/{pid}")
    public ResponseEntity<List<Blog>> findAllBlog(@PathVariable("status") String status,@PathVariable("pid") String pid){
        try{
            List<Blog> list=this.blogService.findAllBlog(status,pid);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/blogurl/{status}")
    public ResponseEntity<Blog> findBlogByStatusUrl(@PathVariable("status") String status){
        try{
            Blog list=this.blogService.findAllByUrl(status);
            if(list==null){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.of(Optional.of(list));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @DeleteMapping("/blog/{id}")
    public ResponseEntity<Void> deleteOrganization(@PathVariable("id") Long id){
        try{
            this.blogService.deleteBlog(id);
            return ResponseEntity.ok().build();
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
