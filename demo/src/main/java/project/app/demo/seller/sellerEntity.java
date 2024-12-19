package project.app.demo.seller;

import project.app.demo.user.userEntity;

public class sellerEntity extends userEntity {


    private String business_name;

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }
}
