package project.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import project.app.demo.multimedia.MULTIMEDIA_TYPE;
import project.app.demo.multimedia.multimediaEntity;
import project.app.demo.property.propertyEntity;
import project.app.demo.seller.sellerEntity;
import project.app.demo.seller.sellerInfoService;
import project.app.demo.user.userEntity;
import project.app.demo.user.userInfoService;
import project.app.demo.user.userRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		sellerInfoService userDao = context.getBean(sellerInfoService.class);
		userInfoService userDao2 = context.getBean(userInfoService.class);

		sellerEntity seller_Entity=new sellerEntity();
		seller_Entity.setEmail("abaday@eston.dz");
		seller_Entity.setUsername("90lkabaday");
		seller_Entity.setUser_id(14);
		seller_Entity.setPassword_hash("a2222222222ichiaichi");
		seller_Entity.setBusiness_name("dkkd");
		LocalDateTime localDateTime = LocalDateTime.of(2024, 12, 14, 15, 30, 0);
		Timestamp timestamp = Timestamp.valueOf(localDateTime);
		seller_Entity.setCreated_at(timestamp);
		//-------------------------------------------------
		propertyEntity property=new propertyEntity();
		property.setArea(1299.11);
		property.setTitle("house in constantine with pool");
		property.setLocation("25 ee khroub");
		property.setDescription("el khroub constantine");
		property.setPrice(122.12);
		//-------------------------------------------------
		multimediaEntity mlt=new multimediaEntity();
		mlt.setData("issikwiwkk21i2kwsks201sk");
		mlt.setType(MULTIMEDIA_TYPE.PHOTO);
		mlt.setTitle("oslllllllllls");
		List<multimediaEntity> multimediaEntityList=new ArrayList<>();
		multimediaEntityList.add(mlt);

		//userDao.add_seller(seller_Entity);
		//userDao.add_property(seller_Entity,property,multimediaEntityList);

	}
}