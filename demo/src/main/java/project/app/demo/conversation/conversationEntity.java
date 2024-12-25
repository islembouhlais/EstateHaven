package project.app.demo.conversation;

import org.springframework.stereotype.Repository;
import project.app.demo.client.clientEntity;
import project.app.demo.message.messageEntity;
import project.app.demo.property.propertyEntity;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class conversationEntity {

    private Integer id;
    private clientEntity client;
    private propertyEntity property;
    private Timestamp created_at;
    private List<messageEntity> messageEntities;


    public clientEntity getClient() {
        return client;
    }

    public propertyEntity getProperty() {
        return property;
    }

    public void setClient(clientEntity client) {
        this.client = client;
    }

    public void setProperty(propertyEntity property) {
        this.property = property;
    }

    public List<messageEntity> getMessageEntities() {
        return messageEntities;
    }

    public void setMessageEntities(List<messageEntity> messageEntities) {
        this.messageEntities = messageEntities;
    }



    public Integer getId() {
        return id;
    }



    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}
