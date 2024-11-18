package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Histry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String sponcerid;
    private String sponcername;
    private String amount;
    private String camount;
    private String curency;
    private String type;
    private String note;
    private String datetime;
    private String status;
    public Histry(Long id, String userid, String sponcerid, String sponcername, String amount, String camount,
            String curency, String type, String note, String datetime, String status) {
        this.id = id;
        this.userid = userid;
        this.sponcerid = sponcerid;
        this.sponcername = sponcername;
        this.amount = amount;
        this.camount = camount;
        this.curency = curency;
        this.type = type;
        this.note = note;
        this.datetime = datetime;
        this.status = status;
    }
    public Histry() {
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
    public String getSponcerid() {
        return sponcerid;
    }
    public void setSponcerid(String sponcerid) {
        this.sponcerid = sponcerid;
    }
    public String getSponcername() {
        return sponcername;
    }
    public void setSponcername(String sponcername) {
        this.sponcername = sponcername;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getCamount() {
        return camount;
    }
    public void setCamount(String camount) {
        this.camount = camount;
    }
    public String getCurency() {
        return curency;
    }
    public void setCurency(String curency) {
        this.curency = curency;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public String getDatetime() {
        return datetime;
    }
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Histry [id=" + id + ", userid=" + userid + ", sponcerid=" + sponcerid + ", sponcername=" + sponcername
                + ", amount=" + amount + ", camount=" + camount + ", curency=" + curency + ", type=" + type + ", note="
                + note + ", datetime=" + datetime + ", status=" + status + "]";
    }
    
}
