package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String blogTitle;
    @Column(name="shortDescription", length=1000)
    private String shortDescription;
    private String images;
    @Column(name="description", length=15000)
    private String description;
    private String title;
    private String keyword;
    private String discription;
    private String status;
    private String url;
    private String userid;
    private String date;
    private String project;
    private String categories;
    private String redurl;
    public Blog(Long id, String blogTitle, String shortDescription, String images, String description, String title,
            String keyword, String discription, String status, String url, String userid, String date, String project,
            String categories, String redurl) {
        this.id = id;
        this.blogTitle = blogTitle;
        this.shortDescription = shortDescription;
        this.images = images;
        this.description = description;
        this.title = title;
        this.keyword = keyword;
        this.discription = discription;
        this.status = status;
        this.url = url;
        this.userid = userid;
        this.date = date;
        this.project = project;
        this.categories = categories;
        this.redurl = redurl;
    }
    public Blog() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBlogTitle() {
        return blogTitle;
    }
    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public String getImages() {
        return images;
    }
    public void setImages(String images) {
        this.images = images;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public String getDiscription() {
        return discription;
    }
    public void setDiscription(String discription) {
        this.discription = discription;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }
    public String getCategories() {
        return categories;
    }
    public void setCategories(String categories) {
        this.categories = categories;
    }
    public String getRedurl() {
        return redurl;
    }
    public void setRedurl(String redurl) {
        this.redurl = redurl;
    }
    @Override
    public String toString() {
        return "Blog [id=" + id + ", blogTitle=" + blogTitle + ", shortDescription=" + shortDescription + ", images="
                + images + ", description=" + description + ", title=" + title + ", keyword=" + keyword
                + ", discription=" + discription + ", status=" + status + ", url=" + url + ", userid=" + userid
                + ", date=" + date + ", project=" + project + ", categories=" + categories + ", redurl=" + redurl + "]";
    }
}
