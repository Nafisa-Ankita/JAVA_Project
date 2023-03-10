package interfaces;

import classes.Restaurant;

public interface RestaurantOperations
{
	void insertRestaurant(Restaurant r);
	void removeRestaurant(Restaurant r);
	Restaurant getRestaurant(String rid);
	void showAllRestaurants();
}