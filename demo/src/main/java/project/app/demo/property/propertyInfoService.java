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


    public propertyInfoService(propertyRepository property_repository,multimediaInfoService multimediaInfoService) {
        this.property_repository = property_repository;
        this.multimediaInfo_Service = multimediaInfoService;
    }
    public void add_property(propertyEntity property) {
      int id_pro = property_repository.add_property(property);

        for (multimediaEntity mlt : property.getMultimediaEntities()) {
            mlt.getProperty().setProperty_id(id_pro);
            multimediaInfo_Service.add_multimedia(mlt,property);
        }
        }
}
