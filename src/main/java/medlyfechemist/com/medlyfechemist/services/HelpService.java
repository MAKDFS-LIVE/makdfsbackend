package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import medlyfechemist.com.medlyfechemist.dao.HelpRepository;
import medlyfechemist.com.medlyfechemist.entites.Help;

@Component
public class HelpService {
    @Autowired
    private HelpRepository helpRepository;

    public Help addCoin(Help b){
        Help result = helpRepository.save(b);
        return result;
    }

    public List<Help> findAll(){
        List<Help> list = this.helpRepository.findAll();
        return list;
    }

    public List<Help> findAllByStatus(String num){
        List<Help> list = this.helpRepository.findAllByStatus(num);
        return list;
    }
}
