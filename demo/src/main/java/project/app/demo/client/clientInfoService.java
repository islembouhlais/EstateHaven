package project.app.demo.client;

import org.springframework.stereotype.Service;
import project.app.demo.conversation.conversationEntity;
import project.app.demo.conversation.conversationInfoService;

@Service
public class clientInfoService {

    private final conversationInfoService conversationInfo_Service;
    private final clientRepository client_Repository;

    public clientInfoService(conversationInfoService conversationInfo_Service, clientRepository client_Repository) {
        this.conversationInfo_Service = conversationInfo_Service;
        this.client_Repository = client_Repository;
    }

    void add_client(clientEntity client) {
        client_Repository.add_client(client);
    }

    public void add_conversation(conversationEntity conversation) {
        this.conversationInfo_Service.add_conversation(conversation);
    }

}
