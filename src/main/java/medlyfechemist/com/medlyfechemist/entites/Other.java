package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Other {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String exchange;
    private String name;
    private String walletid;
    private String wallettoken;
    private String status;
    public Other(Long id, String userid, String exchange, String name, String walletid, String wallettoken,
            String status) {
        this.id = id;
        this.userid = userid;
        this.exchange = exchange;
        this.name = name;
        this.walletid = walletid;
        this.wallettoken = wallettoken;
        this.status = status;
    }
    public Other() {
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
    public String getExchange() {
        return exchange;
    }
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWalletid() {
        return walletid;
    }
    public void setWalletid(String walletid) {
        this.walletid = walletid;
    }
    public String getWallettoken() {
        return wallettoken;
    }
    public void setWallettoken(String wallettoken) {
        this.wallettoken = wallettoken;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Other [id=" + id + ", userid=" + userid + ", exchange=" + exchange + ", name=" + name + ", walletid="
                + walletid + ", wallettoken=" + wallettoken + ", status=" + status + "]";
    }
    
}
