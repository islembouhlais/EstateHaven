package project.app.demo.property;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import project.app.demo.seller.sellerEntity;

import java.sql.PreparedStatement;
import java.sql.Statement;

/*
private int property_id;
    private String title;
    private  String description;
    private double price;
    private String location;
    private Timestamp listed_date;
    private int seller_id;
 */
@Repository
public class propertyRepository {

    private final JdbcTemplate jdbcTemplate;

    public propertyRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int add_property(propertyEntity property){
        String sql="INSERT INTO property (seller_id,title,description,price,location,listed_date,area) values(?,?,?,?,?,?,?) ";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        try {
            jdbcTemplate.update(connection -> {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,property.getSeller().getUser_id());
                ps.setString(2,property.getTitle());
                ps.setString(3, property.getDescription());
                ps.setDouble(4,property.getPrice());
                ps.setString(5,property.getLocation());
                ps.setTimestamp(6,property.getListed_date());
                ps.setDouble(7,property.getArea());
                return ps;
            }, keyHolder);
        }

        catch (DataAccessException e) {
            throw new RuntimeException("Error inserting user", e);
        }
        return keyHolder.getKey().intValue();
    }
}
/*

KeyHolder keyHolder = new GeneratedKeyHolder();
   // if(!this.emailExists(user.getEmail())) {
        try {
            jdbcTemplate.update(connection -> {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getEmail());
                ps.setString(3, user.getPassword_hash());
                ps.setTimestamp(4, user.getCreated_at());
                return ps;
            }, keyHolder);
        }

        catch (DataAccessException e) {
            throw new RuntimeException("Error inserting user", e);
        }
        return keyHolder.getKey().intValue();
 */
/*

 seller.getUser_id(),
                    property.getTitle(),
                    property.getDescription(),
                    property.getPrice(),
                    property.getLocation(),
                    property.getListed_date(),
                    property.getArea()
 */