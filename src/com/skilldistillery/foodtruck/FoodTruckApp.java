package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		// Scanner, menu
		Scanner sc = new Scanner(System.in);
		boolean activeVoter = true;
		int userInput = 0;

		FoodTruck[] myTrucks = new FoodTruck[5];

		Voter user = new Voter();

		System.out.println("Welcome to the Food Truck Challenge!");
		System.out.print("Please provide your name: ");
		user.setName(sc.nextLine());

		while (activeVoter) {
			String foodTruckName = "";
			String foodType = "";
			int truckRating = 0;

			for (int i = 0; i < myTrucks.length; i++) {

				FoodTruck truck = new FoodTruck();
				myTrucks[i] = truck;

				System.out.print("Food truck name: ");
				foodTruckName = sc.nextLine();
				if (foodTruckName.equalsIgnoreCase("quit")) {
					activeVoter = false;
					break;
				}
				truck.setFoodTruckName(foodTruckName);

				System.out.print("Food type: ");
				truck.setFoodType(foodType = sc.nextLine());

				System.out.print("Rating (1 - 5): ");
				truck.setTruckRating(truckRating = sc.nextInt());
				sc.nextLine();

			}
			
			boolean activeUser = true;

			while (activeUser) {
				
				user.finalMenu();
				userInput = sc.nextInt();


				switch (userInput) {
				case 1:
					System.out.println("My trucks include: ");
					user.getTrucks(myTrucks);
					break;

				case 2:
					System.out.println("Your trucks averafe rating is: " + user.getAverage(myTrucks));
					break;

				case 3:
					System.out.println("Your highest rated is: " + user.getHighest(myTrucks));
					break;

				case 4:
					System.out.println("Thank you for voting in the Food Truck Challenge!");
					System.out.println("Good bye.");
					activeUser = false;
					activeVoter = false;
				}

			}

		}
		
		sc.close();

	}

}
