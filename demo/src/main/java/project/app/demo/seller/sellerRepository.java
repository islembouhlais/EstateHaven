package project.app.demo.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import project.app.demo.user.userInfoService;

@Repository
public class sellerRepository {


    private final JdbcTemplate jdbcTemplate;
    private final userInfoService userInfoService;

    public sellerRepository(userInfoService userInfoService, JdbcTemplate jdbcTemplate) {
        this.userInfoService = userInfoService;
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertSeller(sellerEntity seller) {
       int seller_id= userInfoService.Add_user(seller);
         String sql = "INSERT INTO seller (seller_id,business_name) VALUES (?,?)";

            try {
                jdbcTemplate.update(
                        sql,
                        seller_id,
                        seller.getBusiness_name()
                );
            } catch (DataAccessException e) {
                throw new RuntimeException("Error inserting seller-specific data", e);
            }



    }

}
