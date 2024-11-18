package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String paymentType;
    private String name;
    private String accountNo;
    private String ifsc;
    private String bankName;
    private String baranchName;
    private String paytmNo;
    private String upiid;
    private String qrcode;
    private String status;
    public Account(Long id, String userid, String paymentType, String name, String accountNo, String ifsc,
            String bankName, String baranchName, String paytmNo, String upiid, String qrcode, String status) {
        this.id = id;
        this.userid = userid;
        this.paymentType = paymentType;
        this.name = name;
        this.accountNo = accountNo;
        this.ifsc = ifsc;
        this.bankName = bankName;
        this.baranchName = baranchName;
        this.paytmNo = paytmNo;
        this.upiid = upiid;
        this.qrcode = qrcode;
        this.status = status;
    }
    public Account() {
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
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getIfsc() {
        return ifsc;
    }
    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBaranchName() {
        return baranchName;
    }
    public void setBaranchName(String baranchName) {
        this.baranchName = baranchName;
    }
    public String getPaytmNo() {
        return paytmNo;
    }
    public void setPaytmNo(String paytmNo) {
        this.paytmNo = paytmNo;
    }
    public String getUpiid() {
        return upiid;
    }
    public void setUpiid(String upiid) {
        this.upiid = upiid;
    }
    public String getQrcode() {
        return qrcode;
    }
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Account [id=" + id + ", userid=" + userid + ", paymentType=" + paymentType + ", name=" + name
                + ", accountNo=" + accountNo + ", ifsc=" + ifsc + ", bankName=" + bankName + ", baranchName="
                + baranchName + ", paytmNo=" + paytmNo + ", upiid=" + upiid + ", qrcode=" + qrcode + ", status="
                + status + "]";
    }
    
}
