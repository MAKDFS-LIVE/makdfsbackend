package medlyfechemist.com.medlyfechemist.controlers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import medlyfechemist.com.medlyfechemist.entites.Investment;
import medlyfechemist.com.medlyfechemist.entites.Registration;
import medlyfechemist.com.medlyfechemist.entites.Wallet;
import medlyfechemist.com.medlyfechemist.services.InvestmentService;
import medlyfechemist.com.medlyfechemist.services.RegistrationService;
import medlyfechemist.com.medlyfechemist.services.WalletService;

@RestController
@CrossOrigin()
public class WalletControler {
    @Autowired
    private WalletService walletService;
    @Autowired
    private RegistrationService registrationService;
    @Autowired
    private InvestmentService investmentService;

    @PostMapping("/wallet")
    public ResponseEntity<Wallet> addIntern(@RequestBody Wallet jobs){
        Wallet admin = jobs;
        Wallet b=new Wallet();
        try{
            Double amount = Double.parseDouble(jobs.getWallet());
            //Double sponComition = (amount * 0.15);
            //Double comSponComition = (amount * 0.01);
            //Double restAmount = amount - comSponComition;

            Double usdt = Double.parseDouble(jobs.getUsdamnt());
            //Double usdtSponComition = (usdt * 0.15);
            //Double comUsdtSponComition = (usdt * 0.01);
            //Double usdtRestAmount = usdt - comUsdtSponComition;


            /* Double amount = Double.parseDouble(jobs.getWallet());
            Double comition = (amount * 0.0048);
            Double restAmount = amount - comition;
            Double sponComition = (amount * 0.15);
            
            Double usdt = Double.parseDouble(jobs.getUsdamnt());
            Double usdtComition = (usdt * 0.0048);
            Double usdtRestAmount = usdt - usdtComition;
            Double usdtSponComition = (usdt * 0.15); */

            //Company Commition
            /* Wallet commition = new Wallet();
            commition.setCurency("MAK");
            commition.setUserid("1");
            commition.setWallet(comition+"");
            commition.setUsdamnt(usdtComition+"");
            commition.setName("MAKDFS");
            commition.setIcon(jobs.getIcon());
            Wallet finalCommition=walletService.walletPresent("1",commition.getCurency());
            if(finalCommition==null){this.walletService.addUsers(commition);}
            else{
                finalCommition.setWallet( (Double.parseDouble(finalCommition.getWallet()) +Double.parseDouble(commition.getWallet()))+"");
                this.walletService.addUsers(finalCommition);
            } */
            //Company Commition

            //Sponcor Commition
            /* if(Double.parseDouble(jobs.getUsdamnt())>=10){
                Wallet sponcer = walletService.walletBeforeThis(jobs.getUserid());
                if(sponcer==null && jobs.getCurency().equals("MAK")){
                    Registration user = this.registrationService.getUserById(Long.parseLong(jobs.getUserid()));
                    String sponcorId = user.getSponsor();
                    if(!sponcorId.equals("")){
                        Wallet SponcerWallet = new Wallet();
                        SponcerWallet.setCurency("MAK");
                        SponcerWallet.setUserid(sponcorId);
                        SponcerWallet.setWallet(sponComition+"");
                        SponcerWallet.setUsdamnt(usdtSponComition+"");
                        SponcerWallet.setName("MAKDFS");
                        SponcerWallet.setIcon(jobs.getIcon());
                        
                        Wallet finalSponcer=walletService.walletPresent(SponcerWallet.getUserid(),SponcerWallet.getCurency());
                        if(finalSponcer==null){
                            this.walletService.addUsers(SponcerWallet);
                        }
                        else{
                            finalSponcer.setWallet( (Double.parseDouble(finalSponcer.getWallet()) +Double.parseDouble(SponcerWallet.getWallet()))+"");
                            this.walletService.addUsers(finalSponcer);
                        }



                        //if(Double.parseDouble(jobs.getUsdamnt())>=100){
                        //    Wallet SponcerNewWallet = new Wallet();
                        //    SponcerNewWallet.setCurency("MAK");
                        //    SponcerNewWallet.setUserid(sponcorId);
                        //    SponcerNewWallet.setWallet((Double.parseDouble(jobs.getWallet())*0.05)+"");
                        //    SponcerNewWallet.setName("MAKDFS");
                        //    SponcerNewWallet.setIcon("mak.png");
                        //    finalSponcer.setWallet( (Double.parseDouble(finalSponcer.getWallet()) + Double.parseDouble(SponcerNewWallet.getWallet()))+"");
                        //    this.walletService.addUsers(finalSponcer);
                        //}

                        
                        Date date = new Date();
                        String strDateFormat = "yyyy-MM-dd hh:mm a";
                        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
                        String formattedDate= dateFormat.format(date);

                        Investment ins = new Investment();
                        ins.setUserid(jobs.getUserid());
                        ins.setUsdtAmnt(usdtRestAmount+"");
                        ins.setMakAmnt(restAmount+"");
                        ins.setIcon(jobs.getIcon());
                        ins.setCurency("MAK");
                        ins.setName("MAKDFS");
                        ins.setValue("12");
                        ins.setStatus("Active");
                        ins.setRemark("Investment successfull!");
                        ins.setDatetime(formattedDate);
                        this.investmentService.addUsers(ins);

                        jobs.setWallet("0");
                        jobs.setUsdamnt("0");
                        b = this.walletService.addUsers(jobs);
                        return ResponseEntity.of(Optional.of(b));
                    }
                }
            } */
            //Sponcor Commition

            
            Wallet book=walletService.walletPresent(jobs.getUserid(),jobs.getCurency());
            if(book==null){
                //jobs.setWallet(restAmount+"");
                //jobs.setUsdamnt(usdtRestAmount+"");
                jobs.setWallet(amount+"");
                jobs.setUsdamnt(usdt+"");
                b=this.walletService.addUsers(jobs);
            }
            else{
                book.setWallet( (Double.parseDouble(book.getWallet()) + amount)+"");
                book.setUsdamnt((Double.parseDouble(book.getUsdamnt()) + usdt)+"");
                b=this.walletService.addUsers(book);
            }


            //Company Commition
            /* Wallet books=walletService.walletPresent("15993638",jobs.getCurency());
            if(books==null){
                admin.setUserid("15993638");
                admin.setWallet(comSponComition+"");
                admin.setUsdamnt(comUsdtSponComition+"");
                this.walletService.addUsers(admin);
            }
            else{
                books.setUserid("15993638");
                books.setWallet((Double.parseDouble(books.getWallet()) + comSponComition)+"");
                books.setUsdamnt((Double.parseDouble(books.getUsdamnt()) + comUsdtSponComition)+"");
                this.walletService.addUsers(books);
            } */

            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            System.out.println("Error");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/savewallet")
    public ResponseEntity<Wallet> updateWallet(@RequestBody Wallet jobs){
        Wallet b=null;
        try{
            b=this.walletService.addUsers(jobs);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/wallet/{uid}")
    public ResponseEntity<List<Wallet>> selfPayment(@PathVariable("uid") String uid){
        try{
            List<Wallet> list=this.walletService.userWallet(uid);
            if(list.size()<=0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/wallet/{uid}/{curency}")
    public ResponseEntity<Wallet> selfCurencyPayment(@PathVariable("uid") String uid,@PathVariable("curency") String curency){
        Wallet book=walletService.walletPresent(uid,curency);
        if(book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }
}