package project.app.demo.property;

import org.springframework.stereotype.Service;
import project.app.demo.multimedia.multimediaEntity;
import project.app.demo.multimedia.multimediaInfoService;
import project.app.demo.seller.sellerEntity;

import java.util.Iterator;
import java.util.List;

@Service
public class propertyInfoService {

    private final propertyRepository property_repository;
    private  final multimediaInfoService multimediaInfo_Service;

    public List<propertyEntity> findProprtyByWilaya(String wilaya){
        return property_repository.getPropertiesByWilaya(wilaya);
    }


    public propertyInfoService(propertyRepository property_repository,multimediaInfoService multimediaInfoService) {
        this.property_repository = property_repository;
        this.multimediaInfo_Service = multimediaInfoService;
    }
    public int add_property(propertyEntity property) {
      int id_pro = property_repository.add_property(property);
       property.setProperty_id(id_pro);
        for (optionalParts op:property.getOptional_parts()) {
            property_repository.insertOptionalRoomProperty(property_repository.findOptionalRoomIdByName(op.name()),id_pro);
        }

        for (multimediaEntity mlt : property.getMultimediaEntities()) {
            multimediaInfo_Service.add_multimedia(mlt,property);
        }
        return id_pro;
        }
}
