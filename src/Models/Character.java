package Models;

import java.util.ArrayList;
import java.util.List;

public class Character implements HasID{
    Integer ID;
    String name;
    String place;
    List<Product> productList;

    public Character(String place, String name, Integer ID) {
        this.productList = new ArrayList<Product>();
        this.place = place;
        this.name = name;
        this.ID = ID;
    }


    @Override
    public Integer getId() {
        return ID;
    }

    @Override
    public String toString() {
        return "Character{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", productList=" + productList +
                '}';
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
