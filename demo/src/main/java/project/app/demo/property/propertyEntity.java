package project.app.demo.property;


import org.springframework.stereotype.Service;
import project.app.demo.client.clientEntity;
import project.app.demo.conversation.conversationEntity;
import project.app.demo.multimedia.multimediaEntity;
import project.app.demo.seller.sellerEntity;
import project.app.demo.visitRequest.visitRequestEntity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Service
public class propertyEntity {
    private Integer property_id;
    private String title;
    private  String description;
    private double price;
   // private String location;
    private Timestamp listed_date;
    private boolean negotiation;
    private String commune;
    private int room_number;
    private int construction_year;
    private double area;
    private propertyType property_type;
    private sellerEntity seller;
    private List<optionalParts> optional_parts;

    private clientEntity client;
   // private visitRequestEntity visitR;
    private  List<multimediaEntity> multimediaEntities;


    public propertyType getProperty_type() {
        return property_type;
    }

    public void setProperty_type(propertyType property_type) {
        this.property_type = property_type;
    }

    public String getTitle() {
        return title;
    }

    public boolean isNegotiation() {
        return negotiation;
    }

    public int getRoom_number() {
        return room_number;
    }

    public int getConstruction_date() {
        return construction_year;
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



    public List<multimediaEntity> getMultimediaEntities() {
        return multimediaEntities;
    }

    public String getCommune() {
        return commune;
    }

    public void setMultimediaEntities(List<multimediaEntity> multimediaEntities) {
        this.multimediaEntities = multimediaEntities;
    }

    public Integer getProperty_id() {
        return property_id;
    }

    public void setProperty_id(Integer property_id) {
        this.property_id = property_id;
    }



    public clientEntity getClient() {
        return client;
    }

    public void setClient(clientEntity client) {
        this.client = client;
    }

    public sellerEntity getSeller() {
        return seller;
    }

//    public visitRequestEntity getVisitR() {
//        return visitR;
//    }

    public double getArea() {
        return area;
    }



    public Timestamp getListed_date() {
        return listed_date;
    }


//    public void setVisitR(visitRequestEntity visitR) {
//        this.visitR = visitR;
//    }

    public void setSeller(sellerEntity seller) {
        this.seller = seller;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNegotiation(boolean negotiation) {
        this.negotiation = negotiation;
    }

    public void setConstruction_year(int construction_year) {
        this.construction_year = construction_year;
    }

    public void setOptional_parts(List<optionalParts> optional_parts) {
        this.optional_parts = optional_parts;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public int getConstruction_year() {
        return construction_year;
    }

    public List<optionalParts> getOptional_parts() {
        return optional_parts;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public void setListed_date(Timestamp listed_date) {
        this.listed_date = listed_date;
    }


}
