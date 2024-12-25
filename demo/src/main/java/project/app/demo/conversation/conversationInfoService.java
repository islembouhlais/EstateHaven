package project.app.demo.conversation;

import org.springframework.stereotype.Service;

@Service
public class conversationInfoService {

    private final conversationRepository conversation_Repository;

    public conversationInfoService(conversationRepository conversation_Repository) {
        this.conversation_Repository = conversation_Repository;
    }

   public void add_conversation(conversationEntity conversation) {
       conversation_Repository.addConversation(conversation);

   }

}
