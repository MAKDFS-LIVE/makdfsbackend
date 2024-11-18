package medlyfechemist.com.medlyfechemist.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import medlyfechemist.com.medlyfechemist.entites.Help;

public interface HelpRepository extends CrudRepository<Help,Long>{
    public List<Help> findAll();
    public List<Help> findAllByStatus(String id);
}
