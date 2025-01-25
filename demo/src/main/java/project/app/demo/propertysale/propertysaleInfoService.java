package project.app.demo.propertysale;


import org.springframework.stereotype.Service;
import project.app.demo.propertyrint.filterDTO;
import project.app.demo.propertyrint.filterInfo;

import java.util.List;

@Service
public class propertysaleInfoService {

 private final propertysaleRepository repository;


    public propertysaleInfoService(propertysaleRepository repository) {
        this.repository = repository;
    }

    public List<filterDTO> filter(filterInfo info) {


        return repository.filter(info.getPropertyType(), info.getMinprice(), info.getMaxprice(), info.getMinarea(), info.getMaxarea(), info.getCommune());
    }
}
