package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String wallet;
    private String curency;
    private String name;
    private String icon;
    private String usdamnt;
    public Wallet(Long id, String userid, String wallet, String curency, String name, String icon, String usdamnt) {
        this.id = id;
        this.userid = userid;
        this.wallet = wallet;
        this.curency = curency;
        this.name = name;
        this.icon = icon;
        this.usdamnt = usdamnt;
    }
    public Wallet() {
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
    public String getWallet() {
        return wallet;
    }
    public void setWallet(String wallet) {
        this.wallet = wallet;
    }
    public String getCurency() {
        return curency;
    }
    public void setCurency(String curency) {
        this.curency = curency;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getUsdamnt() {
        return usdamnt;
    }
    public void setUsdamnt(String usdamnt) {
        this.usdamnt = usdamnt;
    }
    @Override
    public String toString() {
        return "Wallet [id=" + id + ", userid=" + userid + ", wallet=" + wallet + ", curency=" + curency + ", name="
                + name + ", icon=" + icon + ", usdamnt=" + usdamnt + "]";
    }
}
