package classes;
import  java.lang.*;
import interfaces.*;

public abstract class FoodItem  implements IQuantity {
    protected String fid;
    protected String name;
    protected int availableQuantity;
    protected double price;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void showInfo();

    public void addQuantity(int amount) {
        if(amount>0) {
            System.out.println("Previous Amount: "+ availableQuantity);
            System.out.println("Added Amount: "+ amount);
            availableQuantity += amount;
            System.out.println("Current Amount: "+ availableQuantity);
        }
        else {
            System.out.println("Can Not Add");
        }
    }

    public void sellQuantity(int amount) {
        if(amount>0 && amount<=availableQuantity) {
            System.out.println("Previous Amount: "+ availableQuantity);
            System.out.println("Sell Amount: "+ amount);
            availableQuantity -= amount;
            System.out.println("Current Amount:	"+ availableQuantity);
        }
        else {
            System.out.println("Can Not Sell");
        }
    }

}
