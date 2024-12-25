package project.app.demo.property;


import org.springframework.stereotype.Service;
import project.app.demo.conversation.conversationEntity;
import project.app.demo.multimedia.multimediaEntity;
import project.app.demo.seller.sellerEntity;
import project.app.demo.visitRequest.visitRequestEntity;

import java.sql.Timestamp;
import java.util.List;

@Service
public class propertyEntity {
    private Integer property_id;
    private String title;
    private  String description;
    private double price;
    private String location;
    private Timestamp listed_date;
    private double area;
    private sellerEntity seller;
    private List<conversationEntity> conversationEntityList;
    private visitRequestEntity visitR;
    private  List<multimediaEntity> multimediaEntities;



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

    public List<conversationEntity> getConversationEntityList() {
        return conversationEntityList;
    }

    public List<multimediaEntity> getMultimediaEntities() {
        return multimediaEntities;
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

    public void setConversationEntityList(List<conversationEntity> conversationEntityList) {
        this.conversationEntityList = conversationEntityList;
    }


    public sellerEntity getSeller() {
        return seller;
    }

    public visitRequestEntity getVisitR() {
        return visitR;
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


    public void setVisitR(visitRequestEntity visitR) {
        this.visitR = visitR;
    }

    public void setSeller(sellerEntity seller) {
        this.seller = seller;
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

}
