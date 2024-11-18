package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String paymentid;
    private String sellerid;
    private String usdamnt;
    private String transferant;
    private String curency;
    private String remark;
    private String datetime;
    private String recipt;
    private String status;
    private String icon;
    private String name;
    private String buyCurency;
    private String wallet;
    public Transaction(Long id, String userid, String paymentid, String sellerid, String usdamnt, String transferant,
            String curency, String remark, String datetime, String recipt, String status, String icon, String name,
            String buyCurency, String wallet) {
        this.id = id;
        this.userid = userid;
        this.paymentid = paymentid;
        this.sellerid = sellerid;
        this.usdamnt = usdamnt;
        this.transferant = transferant;
        this.curency = curency;
        this.remark = remark;
        this.datetime = datetime;
        this.recipt = recipt;
        this.status = status;
        this.icon = icon;
        this.name = name;
        this.buyCurency = buyCurency;
        this.wallet = wallet;
    }
    public Transaction() {
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
    public String getPaymentid() {
        return paymentid;
    }
    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }
    public String getSellerid() {
        return sellerid;
    }
    public void setSellerid(String sellerid) {
        this.sellerid = sellerid;
    }
    public String getUsdamnt() {
        return usdamnt;
    }
    public void setUsdamnt(String usdamnt) {
        this.usdamnt = usdamnt;
    }
    public String getTransferant() {
        return transferant;
    }
    public void setTransferant(String transferant) {
        this.transferant = transferant;
    }
    public String getCurency() {
        return curency;
    }
    public void setCurency(String curency) {
        this.curency = curency;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getDatetime() {
        return datetime;
    }
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
    public String getRecipt() {
        return recipt;
    }
    public void setRecipt(String recipt) {
        this.recipt = recipt;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBuyCurency() {
        return buyCurency;
    }
    public void setBuyCurency(String buyCurency) {
        this.buyCurency = buyCurency;
    }
    public String getWallet() {
        return wallet;
    }
    public void setWallet(String wallet) {
        this.wallet = wallet;
    }
    @Override
    public String toString() {
        return "Transaction [id=" + id + ", userid=" + userid + ", paymentid=" + paymentid + ", sellerid=" + sellerid
                + ", usdamnt=" + usdamnt + ", transferant=" + transferant + ", curency=" + curency + ", remark="
                + remark + ", datetime=" + datetime + ", recipt=" + recipt + ", status=" + status + ", icon=" + icon
                + ", name=" + name + ", buyCurency=" + buyCurency + ", wallet=" + wallet + "]";
    }
    
}
