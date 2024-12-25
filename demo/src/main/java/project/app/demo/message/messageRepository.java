package project.app.demo.message;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import project.app.demo.conversation.conversationEntity;

@Service
public class messageRepository {

    private final JdbcTemplate jdbcTemplate;

    public messageRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int add_message(messageEntity message) {
        String sql = "INSERT INTO message (content, conversation_id) VALUES (?, ?)";
        return jdbcTemplate.update(
                sql,
               message.getText(),
               message.getConversation().getId()
        );
    }

}
