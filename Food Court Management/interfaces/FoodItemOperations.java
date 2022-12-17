package interfaces;

import classes.FoodItem;

public interface FoodItemOperations
{
	void insertFoodItem(FoodItem f);
	void removeFoodItem(FoodItem f);
	FoodItem getFoodItem(String fid);
	void showAllFoodItems();
}