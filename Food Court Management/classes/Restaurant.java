package  classes;
import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations
{
	private String name;
	private String rid;
	private FoodItem foodItems[] = new FoodItem [100];
	
	public void setName(String name){this.name = name;}
	public void setRid(String nid){this.rid = nid;}
	
	public String getName(){return name;}
	public String getRid(){return rid;}
	
	public void insertFoodItem(FoodItem a)
	{
		int flag = 0;
		for(int i=0; i<foodItems.length; i++)
		{
			if(foodItems[i] == null)
			{
				foodItems[i] = a;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("FoodItem Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
	public void removeFoodItem(FoodItem a)
	{
		int flag = 0;
		for(int i=0; i<foodItems.length; i++)
		{
			if(foodItems[i] == a)
			{
				foodItems[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("FoodItem Removed");}
		else{System.out.println("Can Not Remove");}
	}

	public void showAllFoodItems()
	{
		for(FoodItem a : foodItems)
		{
			if(a != null)
			{
				a.showInfo();
			}
		}
	}

	public FoodItem getFoodItem(String foodItemNumber)
	{
		FoodItem a = null;
		
		for(int i=0; i<foodItems.length; i++)
		{
			if(foodItems[i] != null)
			{
				if(foodItems[i].getFid().equals(foodItemNumber))
				{
					a = foodItems[i];
					break;
				}
			}
		}
		if(a != null)
		{
			System.out.println("FoodItem Found");
		}
		else
		{
			System.out.println("FoodItem Not Found");
		}
		return a;
	}
}