package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import medlyfechemist.com.medlyfechemist.entites.Blog;

public interface BlogRepository extends CrudRepository<Blog,Long>{
    
    public Blog findById(long id);

    public List<Blog> findAllByOrderByIdDesc();

    public List<Blog> findAllByStatusAndProjectOrderByIdDesc(String status,String id);
    
    public List<Blog> findAllByProjectOrderByIdDesc(String id);
    
    public List<Blog> findAllByStatusOrderByIdDesc(String id);
    
    public Blog findAllByUrlOrderByIdDesc(String id);
}
