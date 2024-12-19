package project.app.demo.property;


import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class propertyEntity {
    private int property_id;
    private String title;
    private  String description;
    private double price;
    private String location;
    private Timestamp listed_date;
    private double area;
    private int seller_id;
    // private List<>
    public int getProperty_id() {
        return property_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public String getLocation() {
        return location;
    }

    public Timestamp getListed_date() {
        return listed_date;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setListed_date(Timestamp listed_date) {
        this.listed_date = listed_date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }
}
