import java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;
import interfaces.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt b = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();

		System.out.println("-----Welcome to Surovee-Nafisa FoodCourt Application-----");

		boolean repeat = true;

		while(repeat)
		{
			System.out.println("What do you want to do?\n");
			System.out.println("	1. Employee Management");
			System.out.println("	2. Restaurant Management");
			System.out.println("	3. Restaurant FoodItem Management");
			System.out.println("	4. FoodItem Quantity Add-Sell");
			System.out.println("	5. Exit\n");

			System.out.print("Your Choice: ");
			String choice = sc.next();

			try {
				switch (choice) {
					case "1":

						System.out.println("--------------------------------");
						System.out.println("You have choosen Employee Management");

						System.out.println("Choose any one Option from the followings\n");
						System.out.println("	1. Insert New Employee");
						System.out.println("	2. Removing an Existing Employee");
						System.out.println("	3. Show All Employees");
						System.out.println("	4. Search an Employee");
						System.out.println("	5. Go Back\n");

						System.out.print("Your Option: ");
						String option1 = sc.next();

						switch (option1) {
							case "1":

								System.out.println("########################");
								System.out.println("Insert New Employee");

								System.out.print("Enter Employee ID: ");
								String empId1 = sc.next();
								System.out.print("Enter Employee Name: ");
								String name1 = sc.next();
								System.out.print("Enter Employee Salary: ");
								double salary1 = sc.nextDouble();

								Employee e1 = new Employee();
								e1.setEmpId(empId1);
								e1.setName(name1);
								e1.setSalary(salary1);

								b.insertEmployee(e1);

								System.out.println("########################");
								break;

							case "4":

								System.out.println("########################");
								System.out.println("Search An Employee");

								System.out.print("Enter Employee ID: ");
								String empId2 = sc.next();

								Employee e2 = b.getEmployee(empId2);

								if (e2 != null) {
									System.out.println();
									System.out.println("Employee ID: " + e2.getEmpId());
									System.out.println("Employee Name: " + e2.getName());
									System.out.println("Employee Salary: " + e2.getSalary());
									System.out.println();
								}

								System.out.println("########################");
								break;

							case "2":

								System.out.println("########################");
								System.out.println("Remove an Existing Employee");

								System.out.print("Enter Employee ID: ");
								String empId3 = sc.next();

								Employee e3 = b.getEmployee(empId3);

								if (e3 != null) {
									b.removeEmployee(e3);
								}
								System.out.println("########################");
								break;

							case "3":

								System.out.println("########################");
								System.out.println("Show All Employees");
								b.showAllEmployees();
								System.out.println("########################");
								break;

							case "5":

								System.out.println("########################");
								System.out.println("Going Back......");
								System.out.println("########################");
								break;

							default:

								System.out.println("########################");
								System.out.println("Invalid Option");
								System.out.println("########################");
								break;
						}

						System.out.println("--------------------------------");
						break;

					case "2":

						System.out.println("--------------------------------");
						System.out.println("You have choosen Restaurant Management");

						System.out.println("Choose any one Option from the followings:\n");
						System.out.println("	1. Insert New Restaurant");
						System.out.println("	2. Removing an Existing Restaurant");
						System.out.println("	3. Show All Restaurants");
						System.out.println("	4. Search a Restaurant");
						System.out.println("	5. Go Back\n");

						System.out.print("Your Option: ");
						String option2 = sc.next();

						switch (option2) {
							case "1":

								System.out.println("########################");
								System.out.println("Insert New Restaurant");

								System.out.print("Enter Restaurant RID: ");
								String rid1 = sc.next();
								System.out.print("Enter Restaurant Name: ");
								String name1 = sc.next();


								Restaurant r1 = new Restaurant();
								r1.setRid(rid1);
								r1.setName(name1);

								b.insertRestaurant(r1);

								System.out.println("########################");
								break;

							case "4":

								System.out.println("########################");
								System.out.println("Search a Restaurant");

								System.out.print("Enter Restaurant RID: ");
								String rid2 = sc.next();

								Restaurant r2 = b.getRestaurant(rid2);

								if (r2 != null) {
									System.out.println();
									System.out.println("Restaurant RID: " + r2.getRid());
									System.out.println("Restaurant Name: " + r2.getName());
									r2.showAllFoodItems();
									System.out.println();
								}

								System.out.println("########################");
								break;

							case "2":

								System.out.println("########################");
								System.out.println("Remove an Existing Restaurant");

								System.out.print("Enter Restaurant RID: ");
								String rid3 = sc.next();

								Restaurant r3 = b.getRestaurant(rid3);

								if (r3 != null) {
									b.removeRestaurant(r3);
								}
								System.out.println("########################");
								break;

							case "3":

								System.out.println("########################");
								System.out.println("Show All Restaurants");
								b.showAllRestaurants();
								System.out.println("########################");
								break;

							case "5":

								System.out.println("########################");
								System.out.println("Going Back......");
								System.out.println("########################");
								break;

							default:

								System.out.println("########################");
								System.out.println("Invalid Option");
								System.out.println("########################");
								break;
						}

						System.out.println("--------------------------------");
						break;

					case "3":

						System.out.println("--------------------------------");
						System.out.println("You have choosen Restaurant FoodItem Management");

						System.out.println("Choose any one Option from the followings:\n");
						System.out.println("	1. Insert New FoodItem");
						System.out.println("	2. Removing an Existing FoodItem");
						System.out.println("	3. Show All FoodItems of a Restaurants");
						System.out.println("	4. Search a FoodItem");
						System.out.println("	5. Go Back\n");

						System.out.print("Your Option: ");
						String option3 = sc.next();

						switch (option3) {
							case "1":

								System.out.println("########################");
								System.out.println("Insert New FoodItem\n");

								FoodItem a = null;

								System.out.println("Which type of FoodItem do you want to Create?\n");
								System.out.println("	1. MainDish");
								System.out.println("	2. Appitizers");
								System.out.println("	3. Go Back\n");

								System.out.print("Enter Type: ");
								int type = sc.nextInt();

								if (type == 1) {
									MainDish md = new MainDish();

									System.out.print("Enter MainDish Number: ");
									String mid1 = sc.next();
									System.out.print("Enter MainDish Category: ");
									String mc1 = sc.next();
									System.out.print("Enter MainDish name: ");
									String mn1 = sc.next();
									System.out.print("Enter Quantity: ");
									int mq1 = sc.nextInt();
									System.out.print("Enter Price: ");
									double mp1 = sc.nextDouble();

									md.setFid(mid1);
									md.setCategory(mc1);
									md.setName(mn1);
									md.setAvailableQuantity(mq1);
									md.setPrice(mp1);

									a = md;

								} else if (type == 2) {
									Appitizers ap = new Appitizers();

									System.out.print("Enter Appitizers Number: ");
									String aid1 = sc.next();
									System.out.print("Enter Appitizers Size: ");
									String as1 = sc.next();
									System.out.print("Enter Appitizers name: ");
									String an1 = sc.next();
									System.out.print("Enter Quantity: ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price: ");
									double ap1 = sc.nextDouble();

									ap.setFid(aid1);
									ap.setSize(as1);
									ap.setName(an1);
									ap.setAvailableQuantity(aq1);
									ap.setPrice(ap1);

									a = ap;

								} else if (type == 3) {
									System.out.println("Going Back.......");
								} else {
									System.out.println("Invalid Type");
								}

								if (a != null) {
									System.out.print("Enter Restaurant RID: ");
									String rid1 = sc.next();
									b.getRestaurant(rid1).insertFoodItem(a);
								}
								System.out.println("########################");
								break;

							case "4":

								System.out.println("########################");
								System.out.println("Search a FoodItem\n");

								System.out.print("Enter Restaurant RID: ");
								String rid2 = sc.next();
								System.out.print("Enter FoodItem Number: ");
								String fn2 = sc.next();

								FoodItem f2 = b.getRestaurant(rid2).getFoodItem(fn2);

								if (f2 != null) {
									f2.showInfo();
								}
								System.out.println("########################");
								break;

							case "2":

								System.out.println("########################");
								System.out.println("Remove an FoodItem");

								System.out.print("Enter Restaurant RID: ");
								String rid3 = sc.next();
								System.out.print("Enter FoodItem Number: ");
								String fn3 = sc.next();

								if(b.getRestaurant(rid3).getFoodItem(fn3) != null) {
									b.getRestaurant(rid3).removeFoodItem(b.getRestaurant(rid3).getFoodItem(fn3));
								}

								System.out.println("########################");
								break;

							case "3":

								System.out.println("########################");
								System.out.println("Show All FoodItems");

								System.out.print("Enter Restaurant RID: ");
								String rid4 = sc.next();

								b.getRestaurant(rid4).showAllFoodItems();

								System.out.println("########################");
								break;

							case "5":

								System.out.println("########################");
								System.out.println("Going Back..");
								System.out.println("########################");
								break;

							default:

								System.out.println("########################");
								System.out.println("Invalid Option");
								System.out.println("########################");
								break;
						}
						System.out.println("--------------------------------");
						break;

					case "4":

						System.out.println("--------------------------------");
						System.out.println("You have choosen FoodItem Quantity Add-Sell");

						System.out.println("Choose any one Option from the followings:\n");
						System.out.println("	1. Add FoodItem");
						System.out.println("	2. Sell FoodItem");
						System.out.println("	3. Show Add Sell History");
						System.out.println("	4. Go Back\n");

						System.out.print("Your Option: ");
						String option4 = sc.next();

						switch (option4) {
							case "1":
								System.out.println("#########################");
								System.out.println("Add FoodItem");
								System.out.print("Enter Restaurant RID: ");
								String rid1 = sc.next();
								System.out.print("Enter FoodItem Number: ");
								String fn1 = sc.next();
								System.out.print("Enter FoodItem Amount: ");
								int amount1 = sc.nextInt();

								if (amount1 > 0) {
									b.getRestaurant(rid1).getFoodItem(fn1).addQuantity(amount1);
									frwd.writeInFile("New " + amount1 + " item has been Added in FoodItem Number " + fn1);
								}
								System.out.println("#########################");
								break;

							case "2":

								System.out.println("#########################");
								System.out.println("Sell FoodItem");
								System.out.print("Enter Restaurant RID: ");
								String rid2 = sc.next();
								System.out.print("Enter FoodItem Number: ");
								String an2 = sc.next();
								System.out.print("Enter Sell Amount: ");
								int amount2 = sc.nextInt();

								if (amount2 > 0 && amount2 <= b.getRestaurant(rid2).getFoodItem(an2).getAvailableQuantity()) {
									b.getRestaurant(rid2).getFoodItem(an2).sellQuantity(amount2);
									frwd.writeInFile(amount2 + " item has been Sell from FoodItem Number " + an2);
								}
								System.out.println("#########################");
								break;

							case "3":

								System.out.println("#########################");
								System.out.println("Show Transaction History\n");
								frwd.readFromFile();
								System.out.println("\n#########################");
								break;

							case "4":

								System.out.println("#########################");
								System.out.println("Going Back");
								System.out.println("#########################");
								break;

							default:

								System.out.println("#########################");
								System.out.println("Invalid Option");
								System.out.println("#########################");
								break;

						}

						System.out.println("--------------------------------");
						break;

					case "5":

						System.out.println("--------------------------------");
						System.out.println("You have choosen to Exit");
						repeat = false;
						System.out.println("--------------------------------");
						break;

					default:

						System.out.println("--------------------------------");
						System.out.println("Invalid Choice");
						System.out.println("--------------------------------");
						break;
				}

			} catch (Exception ex) {
				System.out.println("--------------------------------");
				System.out.println("Invalid Input");
				System.out.println("--------------------------------");
			}

		}


	}
}
