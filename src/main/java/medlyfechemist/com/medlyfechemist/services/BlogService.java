package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.BlogRepository;
import medlyfechemist.com.medlyfechemist.entites.Blog;

@Component
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    public Blog addAddress(Blog b){
        Blog result = blogRepository.save(b);
        return result;
    }
    public List<Blog> findAllByStatus(String num){
        List<Blog> list = this.blogRepository.findAllByStatusOrderByIdDesc(num);
        return list;
    }

    public Blog findAllByUrl(String num){
        Blog list = this.blogRepository.findAllByUrlOrderByIdDesc(num);
        return list;
    }

    
    
    public List<Blog> findAllBlog(){
        List<Blog> list = this.blogRepository.findAllByOrderByIdDesc();
        return list;
    }

    public List<Blog> findAllBlog(String pid){
        List<Blog> list = this.blogRepository.findAllByProjectOrderByIdDesc(pid);
        return list;
    }
    
    public List<Blog> findAllBlog(String status,String pid){
        List<Blog> list = this.blogRepository.findAllByStatusAndProjectOrderByIdDesc(status,pid);
        return list;
    }
    
    public void deleteBlog(Long id){
        blogRepository.deleteById(id);
    }
}
