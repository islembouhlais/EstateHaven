package project.app.demo.property;

import org.springframework.stereotype.Service;
import project.app.demo.multimedia.multimediaInfoService;
import project.app.demo.seller.sellerEntity;

@Service
public class propertyInfoService {

    private final propertyRepository property_repository;
    private  final multimediaInfoService multimediaInfo_Service;


    public propertyInfoService(propertyRepository property_repository,multimediaInfoService multimediaInfoService) {
        this.property_repository = property_repository;
        this.multimediaInfo_Service=multimediaInfoService;
    }
    public void add_property(sellerEntity seller, propertyEntity property){
        this.property_repository.add_property(seller,property);

    }
}
