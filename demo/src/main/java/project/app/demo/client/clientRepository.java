package project.app.demo.client;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import project.app.demo.user.userEntity;
import project.app.demo.user.userInfoService;

@Repository
public class clientRepository {

    private final JdbcTemplate jdbcTemplate;
    private final userInfoService userInfoService;

    public clientRepository(userInfoService userInfoService, JdbcTemplate jdbcTemplate) {
        this.userInfoService = userInfoService;
        this.jdbcTemplate = jdbcTemplate;
    }

    void add_client(clientEntity client) {
        int client_id = userInfoService.Add_user(client);
        String sql = "INSERT INTO client (client_id) VALUES (?)";

        try {
            jdbcTemplate.update(
                    sql,
                    client_id
            );
        } catch (DataAccessException e) {
            throw new RuntimeException("Error inserting seller-specific data", e);

        }

    }

}
