package startio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Listing {

    @JsonIgnore
    private String sessionId;

    private String advertiserId;

    private String country;

    private String price;

    private String eventTypeId;

    private String gdpr;

    private String minCpm;

    private String priority;

    private String bidPrice;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getGdpr() {
        return gdpr;
    }

    public void setGdpr(String gdpr) {
        this.gdpr = gdpr;
    }

    public String getMinCpm() {
        return minCpm;
    }

    public void setMinCpm(String minCpm) {
        this.minCpm = minCpm;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "sessionId='" + sessionId + '\'' +
                ", advertiserId='" + advertiserId + '\'' +
                ", country='" + country + '\'' +
                ", price='" + price + '\'' +
                ", eventTypeId='" + eventTypeId + '\'' +
                ", gdpr='" + gdpr + '\'' +
                ", minCpm='" + minCpm + '\'' +
                ", priority='" + priority + '\'' +
                ", bidPrice='" + bidPrice + '\'' +
                '}';
    }
}
