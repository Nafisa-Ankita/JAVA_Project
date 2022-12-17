package classes;
import java.lang.*;

public class MainDish extends FoodItem {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void showInfo() {
        System.out.println("FoodItem Number: " + fid);
        System.out.println("FoodItem Name: " + name);
        System.out.println("FoodItem Available Quantity: " + availableQuantity);
        System.out.println("FoodItem Price: " + price);
        System.out.println("FoodItem Category: " + category);
        System.out.println();
    }
}
