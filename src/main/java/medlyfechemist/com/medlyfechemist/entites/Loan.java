package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String usdtAmnt;
    private String localCurency;
    private String icon;
    private String curency;
    private String name;
    private String value;
    private String status;
    private String remark;
    private String datetime;
    private String creditedUsd;
    private String creditedMak;
    private String recoveryUsd;
    private String recoveryMak;
    private String interestRate;
    private String processingfee;
    private String sequrity;
    private String preeningfee;
    private String finalInterest;
    private String tenure;
    public Loan(Long id, String userid, String usdtAmnt, String localCurency, String icon, String curency, String name,
            String value, String status, String remark, String datetime, String creditedUsd, String creditedMak,
            String recoveryUsd, String recoveryMak, String interestRate, String processingfee, String sequrity,
            String preeningfee, String finalInterest, String tenure) {
        this.id = id;
        this.userid = userid;
        this.usdtAmnt = usdtAmnt;
        this.localCurency = localCurency;
        this.icon = icon;
        this.curency = curency;
        this.name = name;
        this.value = value;
        this.status = status;
        this.remark = remark;
        this.datetime = datetime;
        this.creditedUsd = creditedUsd;
        this.creditedMak = creditedMak;
        this.recoveryUsd = recoveryUsd;
        this.recoveryMak = recoveryMak;
        this.interestRate = interestRate;
        this.processingfee = processingfee;
        this.sequrity = sequrity;
        this.preeningfee = preeningfee;
        this.finalInterest = finalInterest;
        this.tenure = tenure;
    }
    public Loan() {
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
    public String getLocalCurency() {
        return localCurency;
    }
    public void setLocalCurency(String localCurency) {
        this.localCurency = localCurency;
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
    public String getCreditedUsd() {
        return creditedUsd;
    }
    public void setCreditedUsd(String creditedUsd) {
        this.creditedUsd = creditedUsd;
    }
    public String getCreditedMak() {
        return creditedMak;
    }
    public void setCreditedMak(String creditedMak) {
        this.creditedMak = creditedMak;
    }
    public String getRecoveryUsd() {
        return recoveryUsd;
    }
    public void setRecoveryUsd(String recoveryUsd) {
        this.recoveryUsd = recoveryUsd;
    }
    public String getRecoveryMak() {
        return recoveryMak;
    }
    public void setRecoveryMak(String recoveryMak) {
        this.recoveryMak = recoveryMak;
    }
    public String getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }
    public String getProcessingfee() {
        return processingfee;
    }
    public void setProcessingfee(String processingfee) {
        this.processingfee = processingfee;
    }
    public String getSequrity() {
        return sequrity;
    }
    public void setSequrity(String sequrity) {
        this.sequrity = sequrity;
    }
    public String getPreeningfee() {
        return preeningfee;
    }
    public void setPreeningfee(String preeningfee) {
        this.preeningfee = preeningfee;
    }
    public String getFinalInterest() {
        return finalInterest;
    }
    public void setFinalInterest(String finalInterest) {
        this.finalInterest = finalInterest;
    }
    public String getTenure() {
        return tenure;
    }
    public void setTenure(String tenure) {
        this.tenure = tenure;
    }
    @Override
    public String toString() {
        return "Loan [id=" + id + ", userid=" + userid + ", usdtAmnt=" + usdtAmnt + ", localCurency=" + localCurency
                + ", icon=" + icon + ", curency=" + curency + ", name=" + name + ", value=" + value + ", status="
                + status + ", remark=" + remark + ", datetime=" + datetime + ", creditedUsd=" + creditedUsd
                + ", creditedMak=" + creditedMak + ", recoveryUsd=" + recoveryUsd + ", recoveryMak=" + recoveryMak
                + ", interestRate=" + interestRate + ", processingfee=" + processingfee + ", sequrity=" + sequrity
                + ", preeningfee=" + preeningfee + ", finalInterest=" + finalInterest + ", tenure=" + tenure + "]";
    }    
}
