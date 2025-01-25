package project.app.demo.propertysale;

public class filterInfo {

    private double minprice;
    private double maxprice;
    private double minarea;
    private double maxarea;
    private String commune;
    private String propertyType;


    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public double getMinprice() {
        return minprice;
    }

    public double getMaxprice() {
        return maxprice;
    }

    public double getMaxarea() {
        return maxarea;
    }

    public double getMinarea() {
        return minarea;
    }

    public String getCommune() {
        return commune;
    }

    public void setMinprice(double minprice) {
        this.minprice = minprice;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public void setMinarea(double minarea) {
        this.minarea = minarea;
    }

    public void setMaxprice(double maxprice) {
        this.maxprice = maxprice;
    }

    public void setMaxarea(double maxarea) {
        this.maxarea = maxarea;
    }
}
