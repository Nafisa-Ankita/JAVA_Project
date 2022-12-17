package classes;
import java.lang.*;

public class Appitizers extends FoodItem {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void showInfo() {
        System.out.println("FoodItem Number: " + fid);
        System.out.println("FoodItem Name: " + name);
        System.out.println("FoodItem Available Quantity: " + availableQuantity);
        System.out.println("FoodItem Price: " + price);
        System.out.println("FoodItem Size: " + size);
        System.out.println();
    }
}
