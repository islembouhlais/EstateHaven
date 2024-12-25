package project.app.demo.conversation;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import project.app.demo.client.clientEntity;
import project.app.demo.property.propertyEntity;
import project.app.demo.user.userInfoService;

@Service
public class conversationRepository {

    private final JdbcTemplate jdbcTemplate;

    public conversationRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int addConversation(conversationEntity conversation) {
        String sql = "INSERT INTO conversation (client_id, property_id, created_at) VALUES (?, ?, ?)";
        return jdbcTemplate.update(
                sql,
                conversation.getClient().getUser_id(),   // Correct getter for client_id
                conversation.getProperty().getProperty_id(), // Correct getter for property_id
                conversation.getCreated_at()  // No trailing comma
        );
    }
}
