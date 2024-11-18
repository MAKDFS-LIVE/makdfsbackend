package medlyfechemist.com.medlyfechemist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import medlyfechemist.com.medlyfechemist.dao.PaymentRepository;
import medlyfechemist.com.medlyfechemist.entites.Payment;

@Component
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    
    public List<Payment> allPayment(String contact,String amount){
        List<Payment> list =  (List<Payment>) this.paymentRepository.allPayment(contact,amount);
        return list;
    }
    public List<Payment> selPayment(String contact){
        List<Payment> list =  (List<Payment>) this.paymentRepository.selPayment(contact);
        return list;
    }
    public Payment addUsers(Payment b){
        Payment result = paymentRepository.save(b);
        return result;
    }
}
