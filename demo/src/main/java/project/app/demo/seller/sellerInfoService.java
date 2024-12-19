package project.app.demo.seller;

import org.springframework.stereotype.Service;
import project.app.demo.property.propertyEntity;
import project.app.demo.property.propertyInfoService;
@Service
public class sellerInfoService {

    private final sellerRepository seller_Repository;
    private final propertyInfoService propertyInfo_service;
    public sellerInfoService(sellerRepository seller_Repository, propertyInfoService propertyInfoService) {
        this.seller_Repository = seller_Repository;
        this.propertyInfo_service = propertyInfoService;
    }

    public void add_seller(sellerEntity sellerEntity){
        seller_Repository.insertSeller(sellerEntity);
    }

    public void add_property(sellerEntity seller, propertyEntity property){
        this.propertyInfo_service.add_property(seller,property);
    }

}
