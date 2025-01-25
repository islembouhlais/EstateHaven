package project.app.demo.propertyrint;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class propertyRintController {

    private final propertyrintInfoService propertyrintInfo_Service;

    public propertyRintController(propertyrintInfoService propertyrintInfo_Service) {
        this.propertyrintInfo_Service = propertyrintInfo_Service;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/filterRent")
    public List<filterDTO> filter(@RequestBody filterInfo info){
        return propertyrintInfo_Service.filter(info);
    }

}
