package project.app.demo.visitRequest;

import project.app.demo.client.clientEntity;
import project.app.demo.property.propertyEntity;

import java.sql.Timestamp;

public class visitRequestEntity {

private Integer id;
private clientEntity client;
private propertyEntity property;
private Timestamp request_date;
private visitRequestStatus visitRequestStatus;

    public project.app.demo.visitRequest.visitRequestStatus getVisitRequestStatus() {
        return visitRequestStatus;
    }

    public void setVisitRequestStatus(project.app.demo.visitRequest.visitRequestStatus visitRequestStatus) {
        this.visitRequestStatus = visitRequestStatus;
    }

    public clientEntity getClient() {
        return client;
    }

    public Integer getId() {
        return id;
    }

    public propertyEntity getProperty_id() {
        return property;
    }

    public Timestamp getRequest_date() {
        return request_date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setClient_id(clientEntity client) {
        this.client = client;
    }

    public void setProperty_id(propertyEntity property) {
        this.property = property;
    }

    public void setRequest_date(Timestamp request_date) {
        this.request_date = request_date;
    }
}

