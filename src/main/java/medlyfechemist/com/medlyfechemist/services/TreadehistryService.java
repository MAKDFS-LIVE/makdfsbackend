package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.TreadehistryRepository;
import medlyfechemist.com.medlyfechemist.entites.Treadehistry;


@Component
public class TreadehistryService {
    @Autowired
    private TreadehistryRepository treadehistryRepository;
    
    public Treadehistry addHistry(Treadehistry b){
        Treadehistry result = treadehistryRepository.save(b);
        return result;
    }
    
    public List<Treadehistry> findAllByType(String userid,String type){
        List<Treadehistry> list = this.treadehistryRepository.findAllByUseridAndSymbleOrderByIdDesc(userid,type);
        return list;
    }

    
    public List<Treadehistry> findAllByUserid(String userid){
        List<Treadehistry> list = this.treadehistryRepository.findAllByUseridAndStatusOrderByIdDesc(userid,"Pending");
        return list;
    } 

    public List<Treadehistry> findAllByHistry(String userid){
        List<Treadehistry> list = this.treadehistryRepository.findAllByUseridOrderByIdDesc(userid);
        return list;
    }
}
