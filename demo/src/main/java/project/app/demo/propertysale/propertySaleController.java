package project.app.demo.propertysale;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.app.demo.propertyrint.filterDTO;
import project.app.demo.propertyrint.filterInfo;

import java.util.List;

@RestController
@RequestMapping("/api")
public class propertySaleController {

  private final propertysaleInfoService propertysaleInfo_Service;

    public propertySaleController(propertysaleInfoService propertysaleInfo_Service) {
        this.propertysaleInfo_Service = propertysaleInfo_Service;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/filterSale")
    public List<filterDTO> filter(@RequestBody filterInfo info){
        return propertysaleInfo_Service.filter(info);
    }
}
