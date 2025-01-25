package project.app.demo.property;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import project.app.demo.seller.sellerEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Repository
public class propertyRepository {

    private final JdbcTemplate jdbcTemplate;

    public propertyRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }




    public Integer findOptionalRoomIdByName(String room_name) {
        String sql = "SELECT id FROM optional_rooms WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{room_name}, Integer.class);
    }

    public void insertOptionalRoomProperty(int optionalRoomId, int propertyId) {
        String sql = "INSERT INTO optional_room_property (optional_room_id, property_id) VALUES (?, ?)";
         jdbcTemplate.update(sql, optionalRoomId, propertyId);
    }

    private Integer findCommuneIdByName(String communeName) {
        String sql = "SELECT id FROM commune WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{communeName}, Integer.class);
    }
    public int add_property(propertyEntity property){
        String sql="INSERT INTO property (seller_id,title,description,price,commune_id,listed_date,area,negotiation,room_number,construction_year,property_type) values(?,?,?,?,?,?,?,?,?,?,?) ";
        int commune_id=findCommuneIdByName(property.getCommune());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        try {
            jdbcTemplate.update(connection -> {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,property.getSeller().getUser_id());
                ps.setString(2,property.getTitle());
                ps.setString(3, property.getDescription());
                ps.setDouble(4,property.getPrice());
                ps.setInt(5,commune_id);
                ps.setTimestamp(6,property.getListed_date());
                ps.setDouble(7,property.getArea());
                ps.setBoolean(8,property.isNegotiation());
                ps.setInt(9,property.getRoom_number());
                ps.setInt(10,property.getConstruction_year());
                ps.setString(11,property.getProperty_type().name());
                return ps;
            }, keyHolder);
        }

        catch (DataAccessException e) {
            throw new RuntimeException("Error inserting user", e);
        }
        return keyHolder.getKey().intValue();
    }

    public List<propertyEntity> getPropertiesByWilaya(String wilayaName) {
        String sql =" SELECT property.area, c.name, property.room_number, property.price, property.property_type FROM property JOIN commune c ON c.id = property.commune_id JOIN wilaya w ON w.id = c.wilaya_id WHERE w.name = ?";

        return jdbcTemplate.query(sql, new Object[]{wilayaName}, new RowMapper<propertyEntity>() {
            @Override
            public propertyEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
                propertyEntity property = new propertyEntity();
                property.setArea(rs.getDouble("area"));
                property.setCommune(rs.getString("name"));
                property.setRoom_number(rs.getInt("room_number"));
                property.setPrice(rs.getDouble("price"));
                property.setProperty_type(propertyType.valueOf(rs.getString("property_type")));
                return property;
            }
        });
    }

}
/*




    private propertyType property_type;

 */