package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean truckInput = true;
		int numTrucks = 5;

		System.out.println("Welcome to the Food Truck Challenge!");
		TrucksWrapper myTrucks = new TrucksWrapper(numTrucks);

		while (truckInput) {
			String foodTruckName = "";
			String foodType = "";
			int truckRating = 0;

			for (int i = 0; i < numTrucks; i++) {

				System.out.print("Food truck name: ");
				foodTruckName = sc.nextLine();
				if (foodTruckName.equalsIgnoreCase("quit")) {
					truckInput = false;
					break;
				}

				System.out.print("Food type: ");
				foodType = sc.nextLine();

				System.out.print("Rating (1 - 5): ");
				truckRating = sc.nextInt();
				sc.nextLine();
				myTrucks.truckInput(new FoodTruck(foodTruckName, foodType, truckRating));
			}

			boolean dataReview = true;

			while (dataReview) {
				AppController menu = new AppController();

				menu.printMenu();
				int userInput = sc.nextInt();

				switch (userInput) {
				case 1:
					System.out.println("My trucks include: ");
					myTrucks.printTrucks();
					break;

				case 2:
					System.out.println("Your trucks averafe rating is: " + myTrucks.getAverage());
					break;

				case 3:
					System.out.println("Your highest rated is: " + myTrucks.getHighest());
					break;

				case 4:
					System.out.println("Thank you for voting in the Food Truck Challenge!");
					System.out.println("Good bye.");
					dataReview = false;
					truckInput = false;
				}

			}

		}

		sc.close();

	}

}
