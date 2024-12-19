package project.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import project.app.demo.seller.sellerEntity;
import project.app.demo.seller.sellerInfoService;
import project.app.demo.user.userEntity;
import project.app.demo.user.userRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		sellerInfoService userDao = context.getBean(sellerInfoService.class);

		sellerEntity seller_Entity=new sellerEntity();
		seller_Entity.setEmail("m_bouhlais@eston.dz");
		seller_Entity.setUsername("islem bouhlais");
		seller_Entity.setPassword_hash("aichiaichi");
		seller_Entity.setBusiness_name("dkkd");
		LocalDateTime localDateTime = LocalDateTime.of(2024, 12, 14, 15, 30, 0);
		Timestamp timestamp = Timestamp.valueOf(localDateTime);
		seller_Entity.setCreated_at(timestamp);
        userDao.add_seller(seller_Entity);

	}
}