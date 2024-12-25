package project.app.demo.user;

import org.springframework.stereotype.Service;
import project.app.demo.conversation.conversationEntity;
import project.app.demo.conversation.conversationInfoService;
import project.app.demo.message.messageEntity;
import project.app.demo.message.messageInfoService;
import project.app.demo.property.propertyEntity;
import project.app.demo.property.propertyInfoService;

@Service
public class userInfoService {

    private final userRepository user_Repository;
    private final conversationInfoService conversationInfo_Service;
    private final messageInfoService messageInfo_Service;

    public userInfoService(userRepository user_Repository, conversationInfoService conversationInfo_Service, messageInfoService messageInfo_Service) {
        this.user_Repository = user_Repository;
        this.conversationInfo_Service = conversationInfo_Service;
        this.messageInfo_Service = messageInfo_Service;
    }

    public int Add_user(userEntity user){
      return user_Repository.insertUser(user);
   }




    public void add_message(messageEntity message) {
     this.messageInfo_Service.add_message(message);
    }
}
