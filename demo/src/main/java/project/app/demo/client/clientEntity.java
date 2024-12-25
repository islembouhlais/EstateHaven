package project.app.demo.client;

import project.app.demo.conversation.conversationEntity;
import project.app.demo.user.userEntity;

import java.util.List;

public class clientEntity extends userEntity {
   private List<conversationEntity> conversationEntities;

    public List<conversationEntity> getConversationEntities() {
        return conversationEntities;
    }

    public void setConversationEntities(List<conversationEntity> conversationEntities) {
        this.conversationEntities = conversationEntities;
    }
}



