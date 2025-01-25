package project.app.demo.propertyrint;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class propertyrintInfoService {
    private final propertyrintRepository repository;

    public propertyrintInfoService(propertyrintRepository repository) {
        this.repository = repository;
    }

    public List<filterDTO> filter(filterInfo info) {


        return repository.filter(info.getPropertyType(), info.getMinprice(), info.getMaxprice(), info.getMinarea(), info.getMaxarea(), info.getCommune());
    }
}
