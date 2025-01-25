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


	}
}