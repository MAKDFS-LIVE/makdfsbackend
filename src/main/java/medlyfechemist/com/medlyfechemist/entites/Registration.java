package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String password;
    private String name;
    private String contact;
    private String email;
    private String address;
    private String city;
    private String state;
    private String pin;
    private String cuntry;
    private String LockedWallet;
    private String OpenWallet;
    private String LoanWallet;
    private String refferWallet;
    private String pendingWallet;
    private String linkdin;
    private String facebook;
    private String tweeter;
    private String instagram;
    private String datetime;
    private String usertype;
    private String status;
    private String sponsor;
    private String education;
    private String resume;
    private String memStatus;
    private String deviceId;
    private String profilePic;
    private String referralAmount;
    private String dob;
    private String gender;
    private String panNo;
    private String panImage;
    private String adharNo;
    private String adharFront;
    private String adharBack;
    private String intrest;
    private String comitionAmount;
    public Registration(Long id, String userid, String password, String name, String contact, String email,
            String address, String city, String state, String pin, String cuntry, String lockedWallet,
            String openWallet, String loanWallet, String refferWallet, String pendingWallet, String linkdin,
            String facebook, String tweeter, String instagram, String datetime, String usertype, String status,
            String sponsor, String education, String resume, String memStatus, String deviceId, String profilePic,
            String referralAmount, String dob, String gender, String panNo, String panImage, String adharNo,
            String adharFront, String adharBack, String intrest, String comitionAmount) {
        this.id = id;
        this.userid = userid;
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.cuntry = cuntry;
        LockedWallet = lockedWallet;
        OpenWallet = openWallet;
        LoanWallet = loanWallet;
        this.refferWallet = refferWallet;
        this.pendingWallet = pendingWallet;
        this.linkdin = linkdin;
        this.facebook = facebook;
        this.tweeter = tweeter;
        this.instagram = instagram;
        this.datetime = datetime;
        this.usertype = usertype;
        this.status = status;
        this.sponsor = sponsor;
        this.education = education;
        this.resume = resume;
        this.memStatus = memStatus;
        this.deviceId = deviceId;
        this.profilePic = profilePic;
        this.referralAmount = referralAmount;
        this.dob = dob;
        this.gender = gender;
        this.panNo = panNo;
        this.panImage = panImage;
        this.adharNo = adharNo;
        this.adharFront = adharFront;
        this.adharBack = adharBack;
        this.intrest = intrest;
        this.comitionAmount = comitionAmount;
    }
    public Registration() {
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public String getCuntry() {
        return cuntry;
    }
    public void setCuntry(String cuntry) {
        this.cuntry = cuntry;
    }
    public String getLockedWallet() {
        return LockedWallet;
    }
    public void setLockedWallet(String lockedWallet) {
        LockedWallet = lockedWallet;
    }
    public String getOpenWallet() {
        return OpenWallet;
    }
    public void setOpenWallet(String openWallet) {
        OpenWallet = openWallet;
    }
    public String getLoanWallet() {
        return LoanWallet;
    }
    public void setLoanWallet(String loanWallet) {
        LoanWallet = loanWallet;
    }
    public String getRefferWallet() {
        return refferWallet;
    }
    public void setRefferWallet(String refferWallet) {
        this.refferWallet = refferWallet;
    }
    public String getPendingWallet() {
        return pendingWallet;
    }
    public void setPendingWallet(String pendingWallet) {
        this.pendingWallet = pendingWallet;
    }
    public String getLinkdin() {
        return linkdin;
    }
    public void setLinkdin(String linkdin) {
        this.linkdin = linkdin;
    }
    public String getFacebook() {
        return facebook;
    }
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    public String getTweeter() {
        return tweeter;
    }
    public void setTweeter(String tweeter) {
        this.tweeter = tweeter;
    }
    public String getInstagram() {
        return instagram;
    }
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
    public String getDatetime() {
        return datetime;
    }
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
    public String getUsertype() {
        return usertype;
    }
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getSponsor() {
        return sponsor;
    }
    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public String getResume() {
        return resume;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
    public String getMemStatus() {
        return memStatus;
    }
    public void setMemStatus(String memStatus) {
        this.memStatus = memStatus;
    }
    public String getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getProfilePic() {
        return profilePic;
    }
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
    public String getReferralAmount() {
        return referralAmount;
    }
    public void setReferralAmount(String referralAmount) {
        this.referralAmount = referralAmount;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPanNo() {
        return panNo;
    }
    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }
    public String getPanImage() {
        return panImage;
    }
    public void setPanImage(String panImage) {
        this.panImage = panImage;
    }
    public String getAdharNo() {
        return adharNo;
    }
    public void setAdharNo(String adharNo) {
        this.adharNo = adharNo;
    }
    public String getAdharFront() {
        return adharFront;
    }
    public void setAdharFront(String adharFront) {
        this.adharFront = adharFront;
    }
    public String getAdharBack() {
        return adharBack;
    }
    public void setAdharBack(String adharBack) {
        this.adharBack = adharBack;
    }
    public String getIntrest() {
        return intrest;
    }
    public void setIntrest(String intrest) {
        this.intrest = intrest;
    }
    public String getComitionAmount() {
        return comitionAmount;
    }
    public void setComitionAmount(String comitionAmount) {
        this.comitionAmount = comitionAmount;
    }
    @Override
    public String toString() {
        return "Registration [id=" + id + ", userid=" + userid + ", password=" + password + ", name=" + name
                + ", contact=" + contact + ", email=" + email + ", address=" + address + ", city=" + city + ", state="
                + state + ", pin=" + pin + ", cuntry=" + cuntry + ", LockedWallet=" + LockedWallet + ", OpenWallet="
                + OpenWallet + ", LoanWallet=" + LoanWallet + ", refferWallet=" + refferWallet + ", pendingWallet="
                + pendingWallet + ", linkdin=" + linkdin + ", facebook=" + facebook + ", tweeter=" + tweeter
                + ", instagram=" + instagram + ", datetime=" + datetime + ", usertype=" + usertype + ", status="
                + status + ", sponsor=" + sponsor + ", education=" + education + ", resume=" + resume + ", memStatus="
                + memStatus + ", deviceId=" + deviceId + ", profilePic=" + profilePic + ", referralAmount="
                + referralAmount + ", dob=" + dob + ", gender=" + gender + ", panNo=" + panNo + ", panImage=" + panImage
                + ", adharNo=" + adharNo + ", adharFront=" + adharFront + ", adharBack=" + adharBack + ", intrest="
                + intrest + ", comitionAmount=" + comitionAmount + "]";
    }
    
}
