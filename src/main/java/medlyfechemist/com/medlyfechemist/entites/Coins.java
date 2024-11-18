package medlyfechemist.com.medlyfechemist.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coins { 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String symbol;
    private String name;
    private String image;
    private Double current_price;
    private Double market_cap;
    private Double market_cap_rank;
    private Double fully_diluted_valuation;
    private Double total_volume;
    private Double high_24h;
    private Double low_24h;
    private Double price_change_24h;
    private Double price_change_percentage_24h;
    private Double market_cap_change_24h;
    private Double market_cap_change_percentage_24h;
    private Double circulating_supply;
    private Double total_supply;
    private Double max_supply;
    private Double ath;
    private Double ath_change_percentage;
    private String ath_date;
    private Double atl;
    private Double atl_change_percentage;
    private String atl_date;
    private String roi;
    private String last_updated;
    private String status;
    public Coins(Long id, String symbol, String name, String image, Double current_price, Double market_cap,
            Double market_cap_rank, Double fully_diluted_valuation, Double total_volume, Double high_24h,
            Double low_24h, Double price_change_24h, Double price_change_percentage_24h, Double market_cap_change_24h,
            Double market_cap_change_percentage_24h, Double circulating_supply, Double total_supply, Double max_supply,
            Double ath, Double ath_change_percentage, String ath_date, Double atl, Double atl_change_percentage,
            String atl_date, String roi, String last_updated, String status) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.image = image;
        this.current_price = current_price;
        this.market_cap = market_cap;
        this.market_cap_rank = market_cap_rank;
        this.fully_diluted_valuation = fully_diluted_valuation;
        this.total_volume = total_volume;
        this.high_24h = high_24h;
        this.low_24h = low_24h;
        this.price_change_24h = price_change_24h;
        this.price_change_percentage_24h = price_change_percentage_24h;
        this.market_cap_change_24h = market_cap_change_24h;
        this.market_cap_change_percentage_24h = market_cap_change_percentage_24h;
        this.circulating_supply = circulating_supply;
        this.total_supply = total_supply;
        this.max_supply = max_supply;
        this.ath = ath;
        this.ath_change_percentage = ath_change_percentage;
        this.ath_date = ath_date;
        this.atl = atl;
        this.atl_change_percentage = atl_change_percentage;
        this.atl_date = atl_date;
        this.roi = roi;
        this.last_updated = last_updated;
        this.status = status;
    }
    public Coins() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public Double getCurrent_price() {
        return current_price;
    }
    public void setCurrent_price(Double current_price) {
        this.current_price = current_price;
    }
    public Double getMarket_cap() {
        return market_cap;
    }
    public void setMarket_cap(Double market_cap) {
        this.market_cap = market_cap;
    }
    public Double getMarket_cap_rank() {
        return market_cap_rank;
    }
    public void setMarket_cap_rank(Double market_cap_rank) {
        this.market_cap_rank = market_cap_rank;
    }
    public Double getFully_diluted_valuation() {
        return fully_diluted_valuation;
    }
    public void setFully_diluted_valuation(Double fully_diluted_valuation) {
        this.fully_diluted_valuation = fully_diluted_valuation;
    }
    public Double getTotal_volume() {
        return total_volume;
    }
    public void setTotal_volume(Double total_volume) {
        this.total_volume = total_volume;
    }
    public Double getHigh_24h() {
        return high_24h;
    }
    public void setHigh_24h(Double high_24h) {
        this.high_24h = high_24h;
    }
    public Double getLow_24h() {
        return low_24h;
    }
    public void setLow_24h(Double low_24h) {
        this.low_24h = low_24h;
    }
    public Double getPrice_change_24h() {
        return price_change_24h;
    }
    public void setPrice_change_24h(Double price_change_24h) {
        this.price_change_24h = price_change_24h;
    }
    public Double getPrice_change_percentage_24h() {
        return price_change_percentage_24h;
    }
    public void setPrice_change_percentage_24h(Double price_change_percentage_24h) {
        this.price_change_percentage_24h = price_change_percentage_24h;
    }
    public Double getMarket_cap_change_24h() {
        return market_cap_change_24h;
    }
    public void setMarket_cap_change_24h(Double market_cap_change_24h) {
        this.market_cap_change_24h = market_cap_change_24h;
    }
    public Double getMarket_cap_change_percentage_24h() {
        return market_cap_change_percentage_24h;
    }
    public void setMarket_cap_change_percentage_24h(Double market_cap_change_percentage_24h) {
        this.market_cap_change_percentage_24h = market_cap_change_percentage_24h;
    }
    public Double getCirculating_supply() {
        return circulating_supply;
    }
    public void setCirculating_supply(Double circulating_supply) {
        this.circulating_supply = circulating_supply;
    }
    public Double getTotal_supply() {
        return total_supply;
    }
    public void setTotal_supply(Double total_supply) {
        this.total_supply = total_supply;
    }
    public Double getMax_supply() {
        return max_supply;
    }
    public void setMax_supply(Double max_supply) {
        this.max_supply = max_supply;
    }
    public Double getAth() {
        return ath;
    }
    public void setAth(Double ath) {
        this.ath = ath;
    }
    public Double getAth_change_percentage() {
        return ath_change_percentage;
    }
    public void setAth_change_percentage(Double ath_change_percentage) {
        this.ath_change_percentage = ath_change_percentage;
    }
    public String getAth_date() {
        return ath_date;
    }
    public void setAth_date(String ath_date) {
        this.ath_date = ath_date;
    }
    public Double getAtl() {
        return atl;
    }
    public void setAtl(Double atl) {
        this.atl = atl;
    }
    public Double getAtl_change_percentage() {
        return atl_change_percentage;
    }
    public void setAtl_change_percentage(Double atl_change_percentage) {
        this.atl_change_percentage = atl_change_percentage;
    }
    public String getAtl_date() {
        return atl_date;
    }
    public void setAtl_date(String atl_date) {
        this.atl_date = atl_date;
    }
    public String getRoi() {
        return roi;
    }
    public void setRoi(String roi) {
        this.roi = roi;
    }
    public String getLast_updated() {
        return last_updated;
    }
    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Coins [id=" + id + ", symbol=" + symbol + ", name=" + name + ", image=" + image + ", current_price="
                + current_price + ", market_cap=" + market_cap + ", market_cap_rank=" + market_cap_rank
                + ", fully_diluted_valuation=" + fully_diluted_valuation + ", total_volume=" + total_volume
                + ", high_24h=" + high_24h + ", low_24h=" + low_24h + ", price_change_24h=" + price_change_24h
                + ", price_change_percentage_24h=" + price_change_percentage_24h + ", market_cap_change_24h="
                + market_cap_change_24h + ", market_cap_change_percentage_24h=" + market_cap_change_percentage_24h
                + ", circulating_supply=" + circulating_supply + ", total_supply=" + total_supply + ", max_supply="
                + max_supply + ", ath=" + ath + ", ath_change_percentage=" + ath_change_percentage + ", ath_date="
                + ath_date + ", atl=" + atl + ", atl_change_percentage=" + atl_change_percentage + ", atl_date="
                + atl_date + ", roi=" + roi + ", last_updated=" + last_updated + ", status=" + status + "]";
    }
    
}
