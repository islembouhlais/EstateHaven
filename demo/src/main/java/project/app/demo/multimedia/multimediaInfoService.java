package project.app.demo.multimedia;

import org.springframework.stereotype.Service;
import project.app.demo.property.propertyEntity;

@Service
public class multimediaInfoService {

    private final multimediaRepository multimedia_Repository;

    public multimediaInfoService(multimediaRepository multimedia_Repository) {
        this.multimedia_Repository = multimedia_Repository;
    }

    public void add_multimedia(multimediaEntity multimedia, propertyEntity property){
         this.multimedia_Repository.add_multimedia(multimedia,property);
    }

}
