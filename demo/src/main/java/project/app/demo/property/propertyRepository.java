package project.app.demo.property;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.app.demo.seller.sellerEntity;

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

    public void add_property(sellerEntity seller, propertyEntity property){
        String sql="INSERT INTO property (seller_id,title,description,price,location,listed_date,area) values(?,?,?,?,?,?,?) ";

        try {
            jdbcTemplate.update(
                    sql,
                    seller.getUser_id(),
                    property.getTitle(),
                    property.getDescription(),
                    property.getPrice(),
                    property.getLocation(),
                    property.getListed_date(),
                    property.getArea()
            );
        } catch (DataAccessException e) {
            throw new RuntimeException("Error inserting seller-specific data", e);
        }
    }
}
