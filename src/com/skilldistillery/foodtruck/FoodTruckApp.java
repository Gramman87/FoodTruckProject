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
				truck.setFoodTruckName(foodTruckName);

				System.out.print("Food type: ");
				truck.setFoodType(foodType = sc.nextLine());

				System.out.print("Rating (1 - 5): ");
				truck.setTruckRating(truckRating = sc.nextInt());
				sc.nextLine();

			}

			System.out.println();
			System.out.println("========== MENU =========");
			System.out.println("|                       |");
			System.out.println("|   1. List My Trucks   |");
			System.out.println("|    2. Avrg. Rating    |");
			System.out.println("|   3. Highest Rated    |");
			System.out.println("|       4. Exit         |");
			System.out.println("|                       |");
			System.out.println("=========================");
			System.out.println();
			System.out.print("Enter the number for what you would like to do: ");

			userInput = sc.nextInt();
			boolean activeUser = true;
			
			while (activeUser) {
				
				switch (userInput) {
				case 1:
					user.getTrucks(myTrucks);
					break;
					
				case 2:
					user.getAverage(myTrucks);
					break;
					
				case 3:
					user.getHighest(myTrucks);
					break;
					
				case 4:
					System.out.println("Thank you for voting in the Food Truck Challenge!");
					System.out.println("Good bye.");
					activeUser = false;
				}
				
			}

			sc.close();

		}

	}
	
}
