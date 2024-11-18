package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Treadehistry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String curency;
    private String symble;
    private String amount;
    private String usdt;
    private String price;
    private String type;
    private String status;
    private String datetime;
    public Treadehistry(Long id, String userid, String curency, String symble, String amount, String usdt, String price,
            String type, String status, String datetime) {
        this.id = id;
        this.userid = userid;
        this.curency = curency;
        this.symble = symble;
        this.amount = amount;
        this.usdt = usdt;
        this.price = price;
        this.type = type;
        this.status = status;
        this.datetime = datetime;
    }
    public Treadehistry() {
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
    public String getCurency() {
        return curency;
    }
    public void setCurency(String curency) {
        this.curency = curency;
    }
    public String getSymble() {
        return symble;
    }
    public void setSymble(String symble) {
        this.symble = symble;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getUsdt() {
        return usdt;
    }
    public void setUsdt(String usdt) {
        this.usdt = usdt;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDatetime() {
        return datetime;
    }
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
    @Override
    public String toString() {
        return "Treadehistry [id=" + id + ", userid=" + userid + ", curency=" + curency + ", symble=" + symble
                + ", amount=" + amount + ", usdt=" + usdt + ", price=" + price + ", type=" + type + ", status=" + status
                + ", datetime=" + datetime + "]";
    }
    
}
