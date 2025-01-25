package project.app.demo.property;

public class propertyDto {
    private double price;
    private propertyType propertyType;
    private double area;
    private String commune;
    private int room_number;

    public double getPrice() {
        return price;
    }

    public project.app.demo.property.propertyType getPropertyType() {
        return propertyType;
    }

    public double getArea() {
        return area;
    }

    public int getRoom_number() {
        return room_number;
    }

    public String getCommune() {
        return commune;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPropertyType(project.app.demo.property.propertyType propertyType) {
        this.propertyType = propertyType;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }
}
