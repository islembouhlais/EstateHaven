package project.app.demo.propertyrint;

public class filterDTO {

    private int  property_id;
    private String communeName;
    private String propertyType;
    private double area;
    private double price;
    private int room_number;

    public String getCommuneName() {
        return communeName;
    }

    public int getRoom_number() {
        return room_number;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setCommuneName(String communeName) {
        this.communeName = communeName;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }
}
