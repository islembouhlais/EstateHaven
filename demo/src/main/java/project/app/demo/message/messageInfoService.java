package project.app.demo.message;

import org.springframework.stereotype.Service;

@Service
public class messageInfoService {

    private final messageRepository message_Repository;

    public messageInfoService(messageRepository message_Repository) {
        this.message_Repository = message_Repository;
    }
     public void add_message(messageEntity message) {
        message_Repository.add_message(message);
     }

}
