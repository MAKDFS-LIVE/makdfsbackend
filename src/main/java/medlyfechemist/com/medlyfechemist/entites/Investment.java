package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String usdtAmnt;
    private String makAmnt;
    private String icon;
    private String curency;
    private String name;
    private String value;
    private String status;
    private String remark;
    private String datetime;
    public Investment(Long id, String userid, String usdtAmnt, String makAmnt, String icon, String curency, String name,
            String value, String status, String remark, String datetime) {
        this.id = id;
        this.userid = userid;
        this.usdtAmnt = usdtAmnt;
        this.makAmnt = makAmnt;
        this.icon = icon;
        this.curency = curency;
        this.name = name;
        this.value = value;
        this.status = status;
        this.remark = remark;
        this.datetime = datetime;
    }
    public Investment() {
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
    public String getUsdtAmnt() {
        return usdtAmnt;
    }
    public void setUsdtAmnt(String usdtAmnt) {
        this.usdtAmnt = usdtAmnt;
    }
    public String getMakAmnt() {
        return makAmnt;
    }
    public void setMakAmnt(String makAmnt) {
        this.makAmnt = makAmnt;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
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
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
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
    @Override
    public String toString() {
        return "Investment [id=" + id + ", userid=" + userid + ", usdtAmnt=" + usdtAmnt + ", makAmnt=" + makAmnt
                + ", icon=" + icon + ", curency=" + curency + ", name=" + name + ", value=" + value + ", status="
                + status + ", remark=" + remark + ", datetime=" + datetime + "]";
    }
    
}
