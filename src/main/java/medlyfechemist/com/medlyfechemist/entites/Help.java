package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Help {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String userid;
    private String contact;
    private String email;
    private Double name;
    private Double query;
    private Double image;
    private Double status;
    public Help(Long id, String userid, String contact, String email, Double name, Double query, Double image,
            Double status) {
        this.id = id;
        this.userid = userid;
        this.contact = contact;
        this.email = email;
        this.name = name;
        this.query = query;
        this.image = image;
        this.status = status;
    }
    public Help() {
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
    public Double getName() {
        return name;
    }
    public void setName(Double name) {
        this.name = name;
    }
    public Double getQuery() {
        return query;
    }
    public void setQuery(Double query) {
        this.query = query;
    }
    public Double getImage() {
        return image;
    }
    public void setImage(Double image) {
        this.image = image;
    }
    public Double getStatus() {
        return status;
    }
    public void setStatus(Double status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Help [id=" + id + ", userid=" + userid + ", contact=" + contact + ", email=" + email + ", name=" + name
                + ", query=" + query + ", image=" + image + ", status=" + status + "]";
    }
    
}
