package project.app.demo.seller;

import project.app.demo.property.propertyEntity;
import project.app.demo.user.userEntity;

import java.util.List;

public class sellerEntity extends userEntity {


    private String business_name;
    protected List<propertyEntity> propertieslist;


    public List<propertyEntity> getPropertieslist() {
        return propertieslist;
    }

    public void setPropertieslist(List<propertyEntity> propertieslist) {
        this.propertieslist = propertieslist;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }
}
