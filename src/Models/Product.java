package Models;

public class Product implements HasID {
    Integer ID;
    String name;
    int price;
    String region;

    public Product(String region, int price, String name, Integer ID) {
        this.region = region;
        this.price = price;
        this.name = name;
        this.ID = ID;
    }

    @Override
    public Integer getId() {
        return ID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", region='" + region + '\'' +
                '}';
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
