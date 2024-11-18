package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String accountid;
    private String paymentType;
    private String quantity;
    private String selled;
    private String completation;
    private String status;
    public Payment(Long id, String userid, String accountid, String paymentType, String quantity, String selled,
            String completation, String status) {
        this.id = id;
        this.userid = userid;
        this.accountid = accountid;
        this.paymentType = paymentType;
        this.quantity = quantity;
        this.selled = selled;
        this.completation = completation;
        this.status = status;
    }
    public Payment() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getAccountid() {
        return accountid;
    }
    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getSelled() {
        return selled;
    }
    public void setSelled(String selled) {
        this.selled = selled;
    }
    public String getCompletation() {
        return completation;
    }
    public void setCompletation(String completation) {
        this.completation = completation;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Payment [id=" + id + ", userid=" + userid + ", accountid=" + accountid + ", paymentType=" + paymentType
                + ", quantity=" + quantity + ", selled=" + selled + ", completation=" + completation + ", status="
                + status + "]";
    }
    
}
