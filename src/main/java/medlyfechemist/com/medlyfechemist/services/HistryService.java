package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.HistryRepository;
import medlyfechemist.com.medlyfechemist.entites.Histry;


@Component
public class HistryService {
    @Autowired
    private HistryRepository histryRepository;
    
    public Histry addHistry(Histry b){
        Histry result = histryRepository.save(b);
        return result;
    }

    public List<Histry> findAllByStatus(String type){
        List<Histry> list = this.histryRepository.findAllByStatusOrderByIdDesc(type);
        return list;
    }
    public List<Histry> findAllByType(String userid,String type){
        List<Histry> list = this.histryRepository.findAllByUseridAndTypeOrderByIdDesc(userid,type);
        return list;
    }
    public List<Histry> findAllByUserid(String type){
        List<Histry> list = this.histryRepository.findAllByUseridOrderByIdDesc(type);
        return list;
    }
    public List<Histry> findAllForWithdraw(String type,String status,String note){
        List<Histry> list = this.histryRepository.findAllByTypeAndStatusAndNoteOrderByIdDesc(type,status,note);
        return list;
    }
}
