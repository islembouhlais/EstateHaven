package project.app.demo.user;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class userController {
private final userInfoService userInfo_Service;

    public userController(userInfoService userInfo_Service) {
        this.userInfo_Service = userInfo_Service;
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> Login(@RequestBody userEntity user) {

        Session session=userInfo_Service.find_user(user);
        if(session!=null){
            return ResponseEntity.ok(session);//"Login successful"
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user_not_found");
        }

    }

}
