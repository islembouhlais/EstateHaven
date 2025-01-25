package project.app.demo.seller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class sellerController {

    private final sellerInfoService sellerInfo_Service;

    public sellerController(sellerInfoService sellerInfo_Service) {
        this.sellerInfo_Service = sellerInfo_Service;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/add_seller")
    public ResponseEntity<String> add_seller(@RequestBody sellerEntity seller){
        sellerInfo_Service.add_seller(seller);
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }

}
