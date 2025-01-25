package project.app.demo.propertysale;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.app.demo.property.propertyInfoService;
import project.app.demo.propertyrint.filterDTO;

import java.util.List;

@Repository
public class propertysaleRepository {

    private final JdbcTemplate jdbcTemplate;
    private final propertyInfoService propertyInfo_Service;

    public propertysaleRepository(JdbcTemplate jdbcTemplate, propertyInfoService propertyInfo_Service) {
        this.jdbcTemplate = jdbcTemplate;
        this.propertyInfo_Service = propertyInfo_Service;
    }

    public void add_propertySale(propertysaleEnitty property_sale) {
        int pro_id=propertyInfo_Service.add_property(property_sale);
        String sql="INSERT INTO property_sale(property_id) value(?)";
        jdbcTemplate.update(sql,pro_id);
    }

    public List<project.app.demo.propertyrint.filterDTO> filter(String propertytype, double minPrice, double maxPrice, double minArea, double maxArea, String communeName) {
        String sql = "SELECT * " +
                "FROM property_sale " +
                "JOIN property p ON p.property_id = property_rent.property_id " +
                "JOIN commune  c on c.id=p.commune_id "+
                "WHERE property_rent.property_id NOT IN (SELECT property_id FROM client_rent) " +
                "AND p.property_type = ? " +
                "AND p.price BETWEEN ? AND ? " +
                "AND p.area BETWEEN ? AND ? " +
                "AND p.commune_id IN (SELECT commune.id FROM commune WHERE commune.name = ?)";

        return jdbcTemplate.query(sql, new Object[]{propertytype, minPrice, maxPrice, minArea, maxArea, communeName},
                (rs, rowNum) -> {
                    project.app.demo.propertyrint.filterDTO entity = new filterDTO();
                    entity.setProperty_id(rs.getInt("property_id"));
                    entity.setCommuneName(rs.getString("name"));
                    entity.setPropertyType(rs.getString("property_type"));
                    entity.setArea(rs.getDouble("area"));
                    entity.setPrice(rs.getDouble("price"));
                    entity.setRoom_number(rs.getInt("room_number"));
                    return entity;
                });
    }

}


