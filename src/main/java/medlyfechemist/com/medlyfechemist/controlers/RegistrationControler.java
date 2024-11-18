package medlyfechemist.com.medlyfechemist.controlers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

import medlyfechemist.com.medlyfechemist.entites.Histry;
import medlyfechemist.com.medlyfechemist.entites.Registration;
import medlyfechemist.com.medlyfechemist.services.HistryService;
import medlyfechemist.com.medlyfechemist.services.RegistrationService;

@RestController
@CrossOrigin()
public class RegistrationControler {
    @Autowired
    private RegistrationService registrationService;
    @Autowired
    private HistryService histryService;
    
    @PostMapping("/login")
    public ResponseEntity<Registration> getLogin(@RequestBody String[] id){
        Registration book=registrationService.userLogin(id[0],id[1]);
        if(book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }
    

    @PostMapping("/savereferal")
    public ResponseEntity<Registration> saveReferal(@RequestBody Registration jobs){
        Registration b=null;
        try{
            String[] spons = jobs.getSponsor().split(",");
            jobs.setSponsor(spons[0]);
            b=this.registrationService.addUsers(jobs);

            Histry sponserhistry = new Histry();
            sponserhistry.setUserid(jobs.getId()+"");
            sponserhistry.setSponcerid(spons[1]);
            sponserhistry.setSponcername(spons[2]);
            sponserhistry.setAmount(jobs.getReferralAmount());
            sponserhistry.setCamount("1");
            sponserhistry.setCurency("USDT");
            sponserhistry.setDatetime(jobs.getDatetime());
            sponserhistry.setStatus("Active");
            sponserhistry.setType("Referral");
            sponserhistry.setNote("Payment credited as a reward.");
            this.histryService.addHistry(sponserhistry);

            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/user")
    public ResponseEntity<Registration> addIntern(@RequestBody Registration jobs){
        Registration b=null;
        try{
            b=this.registrationService.addUsers(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/saveuser")
    public ResponseEntity<Registration> addJobs(@RequestBody Registration jobs){
        try{
            Registration book=registrationService.userLogin(jobs.getEmail(),jobs.getContact());
            if(book==null){
                if(jobs.getContact().equals("no")){jobs.setContact("");}
                if(jobs.getEmail().equals("no")){jobs.setEmail("");}
                Registration b=this.registrationService.addUsers(jobs);
                return ResponseEntity.of(Optional.of(b));
            }
            return ResponseEntity.of(Optional.of(book));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/updateuser")
    public ResponseEntity<Registration> updateUser(@RequestBody Registration jobs){
        Registration b=null;
        try{
            b=this.registrationService.addUsers(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @PostMapping("/updateprofile")
    public ResponseEntity<Registration> updateProfile(@RequestBody Registration jobs){
        try{
            Registration book=registrationService.userLogin(jobs.getId(),jobs.getEmail(),jobs.getContact());
            if(book==null){
                Registration b=this.registrationService.addUsers(jobs);
                return ResponseEntity.of(Optional.of(b));
            }
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/updatedocument")
    public ResponseEntity<Registration> updateDocument(@RequestBody Registration jobs){
        try{
            Long spid = -1L;
            if(jobs.getSponsor().length()>0){spid = Long.parseLong(jobs.getSponsor());}
            Registration userData=registrationService.findByContact(jobs.getContact());
            Registration sponcerData=registrationService.getUserById(spid);
            Registration deciveData=registrationService.findByDeviceid(jobs.getDeviceId());
            userData.setName(jobs.getName());
            userData.setDob(jobs.getDob());
            userData.setGender(jobs.getGender());
            userData.setPanNo(jobs.getPanNo());
            userData.setPanImage(jobs.getPanImage());
            userData.setAdharNo(jobs.getAdharNo());
            userData.setAdharFront(jobs.getAdharFront());
            userData.setAdharBack(jobs.getAdharBack());
            userData.setProfilePic(jobs.getProfilePic());
            userData.setDeviceId(jobs.getDeviceId());
            userData.setSponsor(jobs.getSponsor());
            userData.setDatetime(jobs.getDatetime());
            userData.setPassword(jobs.getPassword());
            userData.setEducation("");
            userData.setStatus("Active");
            userData.setRefferWallet("0");
            userData.setReferralAmount("1");
            userData.setIntrest("24");
            userData.setComitionAmount("15");
            userData.setDeviceId(jobs.getDeviceId());

            /* if(sponcerData!=null){
                userData.setReferralAmount(sponcerData.getReferralAmount());
                userData.setIntrest(sponcerData.getIntrest());
                userData.setComitionAmount(sponcerData.getComitionAmount());
                
                if(deciveData==null){
                    userData.setRefferWallet(Double.parseDouble(userData.getRefferWallet()) + Double.parseDouble(userData.getReferralAmount())+"");
                    sponcerData.setRefferWallet(Double.parseDouble(sponcerData.getRefferWallet()) + Double.parseDouble(sponcerData.getReferralAmount())+"");
                    this.registrationService.addUsers(sponcerData);

                    Histry userhistry = new Histry();
                    userhistry.setUserid(userData.getId()+"");
                    userhistry.setSponcerid(sponcerData.getId()+"");
                    userhistry.setSponcername(sponcerData.getName());
                    userhistry.setAmount(userData.getReferralAmount());
                    userhistry.setCamount("40");
                    userhistry.setCurency("INR");
                    userhistry.setDatetime(userData.getDatetime());
                    userhistry.setStatus("Active");
                    userhistry.setType("Referral");
                    userhistry.setNote("You have received a welcome bonus.");
                    this.histryService.addHistry(userhistry);
                    Histry sponserhistry = new Histry();
                    sponserhistry.setUserid(sponcerData.getId()+"");
                    sponserhistry.setSponcerid(userData.getId()+"");
                    sponserhistry.setSponcername(userData.getName());
                    sponserhistry.setAmount(sponcerData.getReferralAmount());
                    sponserhistry.setCamount("40");
                    sponserhistry.setCurency("INR");
                    sponserhistry.setDatetime(userData.getDatetime());
                    sponserhistry.setStatus("Active");
                    sponserhistry.setType("Referral");
                    sponserhistry.setNote("Payment credited as a reward.");
                    this.histryService.addHistry(sponserhistry);
                }
            } */

            Registration b = this.registrationService.addUsers(userData);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Registration> getUser(@PathVariable("id") int id){
        Registration book=registrationService.getUserById(id);
        if(book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @GetMapping("/userbycontact/{contact}/{cuntry}")
    public ResponseEntity<Registration> findByContact(@PathVariable("contact") String contact,@PathVariable("cuntry") String cuntry){
        Registration book=registrationService.findByContact(contact);
        if(book==null){
            Registration user = new Registration();
            user.setContact(contact);
            user.setCuntry(cuntry);
            user.setStatus("Progress");
            user.setUsertype("User");
            user.setEmail("");
            user.setDob("");
            book = this.registrationService.addUsers(user);
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @GetMapping("/userbyemail/{email}/{contact}/{name}/{userid}")
    public ResponseEntity<Registration> findByEmail(@PathVariable("email") String email,@PathVariable("contact") String contact,@PathVariable("name") String name,@PathVariable("userid") String userid){
        Registration user=registrationService.findByEmail(email);
        if(user==null){
            Registration book=registrationService.findByContact(contact);
            if(book!=null){
                book.setEmail(email);
                book.setName(name);
                book.setUserid(userid);
                book.setProfilePic("");
                book.setOpenWallet("0");
                book.setLockedWallet("0");
                book.setLoanWallet("0");
                book.setSponsor("");
                book.setReferralAmount("20");
                book.setGender("");
                book.setPanNo("");
                book.setDatetime((DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).format(LocalDateTime.now()));
                this.registrationService.addUsers(book);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(user));
    }

    @GetMapping("/useremail/{email}/{contact}/{name}/{userid}")
    public ResponseEntity<Registration> findEmail(@PathVariable("email") String email,@PathVariable("contact") String contact,@PathVariable("name") String name,@PathVariable("userid") String userid){
        Registration user=registrationService.findByEmail(email);
        if(user==null){
            Registration contct=registrationService.findByContact(contact);
            if(contct==null){
                Registration book = new Registration();
                book.setEmail(email);
                book.setName(name);
                book.setUserid(userid);
                book.setContact(contact);
                book.setCuntry("India");
                book.setPassword(userid);
                book.setStatus("Active");
                book.setUsertype("User");
                book.setProfilePic("");
                book.setOpenWallet("0");
                book.setLockedWallet("0");
                book.setLoanWallet("0");
                book.setSponsor("");
                book.setReferralAmount("20");
                book.setComitionAmount("15");
                book.setIntrest("24");
                book.setRefferWallet("0");
                book.setGender("");
                book.setPanNo("");
                book.setDatetime((DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).format(LocalDateTime.now()));
                Registration newUser = this.registrationService.addUsers(book);
                return ResponseEntity.of(Optional.of(newUser));
            }
            return ResponseEntity.of(Optional.of(contct));
        }
        return ResponseEntity.of(Optional.of(user));
    }

    @GetMapping("/userbyid/{id}")
    public ResponseEntity<Registration> getUserById(@PathVariable("id") String id){
        Registration book=registrationService.findByUserid(id);
        if(book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @GetMapping("/appversion")
    public ResponseEntity<Registration> getUserById(){
        Registration book=registrationService.getUserById(1);
        if(book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        book.setContact("");
        book.setDatetime("");
        book.setEmail("");
        book.setFacebook("");
        book.setInstagram("");
        book.setName("");
        book.setPassword("");
        book.setUserid("");
        return ResponseEntity.of(Optional.of(book));
    }
    
    @GetMapping("/updatewallet/{id}/{amnt}")
    public ResponseEntity<Registration> getUserById(@PathVariable("id") long id,@PathVariable("amnt") String amnt){
        Registration user=registrationService.getUserById(id);
        if(user!=null){
            user.setOpenWallet((Float.parseFloat(user.getOpenWallet())+Float.parseFloat(amnt))+"");
            registrationService.addUsers(user);
            return ResponseEntity.of(Optional.of(user));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteOrganization(@PathVariable("id") Long id){
        try{
            this.registrationService.deleteUsers(id);
            return ResponseEntity.ok().build();
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/dashboard")
    public ResponseEntity<Registration> getDashboard(){
        Registration book=registrationService.getDashboard();
        if(book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @GetMapping("/alluser/{type}")
    public ResponseEntity<List<Registration>> getAllUsers(@PathVariable("type") String type){
        try{
            List<Registration> list=this.registrationService.getAllUsers(type);
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
