package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.RegistrationRepository;
import medlyfechemist.com.medlyfechemist.entites.Registration;

@Component
public class RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;
    
    /* public Registration userFirstLogin(String email,String contact){
        Registration book=null;
        try{book = this.registrationRepository.loginCheck(email,contact);}
        catch(Exception e){e.printStackTrace();}
        return book;
    } */

    public Registration userLogin(String userid,String contact){
        Registration book=null;
        try{book = this.registrationRepository.login(userid,contact);}
        catch(Exception e){e.printStackTrace();}
        return book;
    }
    
    public Registration userLogin(Long userid,String email,String contact){
        Registration book=null;
        try{book = this.registrationRepository.login(userid,email,contact);}
        catch(Exception e){e.printStackTrace();}
        return book;
    }
    
    public Registration findByContact(String contact){
        Registration book=null;
        try{book = this.registrationRepository.findByContact(contact);}
        catch(Exception e){e.printStackTrace();}
        return book;
    }
    public Registration findByEmail(String email){
        Registration book=null;
        try{book = this.registrationRepository.findByEmail(email);}
        catch(Exception e){e.printStackTrace();}
        return book;
    }
    
    public Registration findByUserid(String userid){
        Registration book=null;
        try{book = this.registrationRepository.findByUserid(userid);}
        catch(Exception e){e.printStackTrace();}
        return book;
    }
    
    public Registration findByDeviceid(String userid){
        Registration book=null;
        try{book = this.registrationRepository.findByDeviceId(userid);}
        catch(Exception e){e.printStackTrace();}
        return book;
    }


    public Registration addUsers(Registration b){
        Registration result = registrationRepository.save(b);
        return result;
    }

    public Registration getUserById(long id){
        Registration users=null;
        try{users = this.registrationRepository.findById(id);}
        catch(Exception e){e.printStackTrace();}
        return users;
    }

    public void deleteUsers(Long bid){
        registrationRepository.deleteById(bid);
    }

    public Registration getDashboard(){
        Registration book=null;
        try{book = this.registrationRepository.getDashboard();}
        catch(Exception e){e.printStackTrace();}
        return book;
    }

    public List<Registration> getAllUsers(String type){
         List<Registration> list ;
        if(type.equals("all")){
            list =  (List<Registration>) this.registrationRepository.getAllUsers();
        }
        else if(type.equals("active")){
            list =  (List<Registration>) this.registrationRepository.getActiveUsers();
        }
        else if(type.equals("totalloanuser")){
            list =  (List<Registration>) this.registrationRepository.getTotalLoanUsers();
        }
        else if(type.equals("totalloanactiveuser")){
            list =  (List<Registration>) this.registrationRepository.getLoanUsers("Active");
        }
        else if(type.equals("totalloancolseuser")){
            list =  (List<Registration>) this.registrationRepository.getLoanUsers("Closed");
        }
        else{
            list =  (List<Registration>) this.registrationRepository.getAllUsers();
        }
        return list;
    }
}
