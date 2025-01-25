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
    public Session find_user(userEntity user){
       userEntity User_ =user_Repository.find_user(user);
        if(User_==null) return  null;
        int user_id=User_.getUser_id();
        String role=user_Repository.getRoleById(user_id);
        int id_session=user_Repository.insertSession(role);
       Session session=new Session();
       session.setRole(role);
       session.setSession_id(id_session);
        return session ;

    }



    public void add_message(messageEntity message) {
     this.messageInfo_Service.add_message(message);
    }
}
