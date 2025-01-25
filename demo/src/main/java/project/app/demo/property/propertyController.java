package project.app.demo.property;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class propertyController {

    private final propertyInfoService propertyInfoService;

    public propertyController(project.app.demo.property.propertyInfoService propertyInfoService) {
        this.propertyInfoService = propertyInfoService;
    }
    @GetMapping("/properties")
    public ResponseEntity<List<propertyDto>> getPropertiesByWilaya(@RequestParam String wilayaName) {
        List<propertyDto> propertyDtoList=new ArrayList<>();
        List<propertyEntity> propertyEntities=propertyInfoService.findProprtyByWilaya(wilayaName);
        for(propertyEntity pr:propertyEntities){
            propertyDto property_Dto=new propertyDto();
            property_Dto.setArea(pr.getArea());
            property_Dto.setPropertyType(pr.getProperty_type());
            property_Dto.setCommune(pr.getCommune());
            property_Dto.setRoom_number(pr.getRoom_number());
            property_Dto.setPrice(pr.getPrice());
            propertyDtoList.add(property_Dto);
        }


         return  ResponseEntity.status(HttpStatus.OK).body(propertyDtoList);

    }



}
