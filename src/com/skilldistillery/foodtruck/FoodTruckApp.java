package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		// Scanner, menu
		Scanner sc = new Scanner(System.in);
		boolean activeUser = true;

		String foodTruckName = "";
		String foodType = "";
		int truckRating = 0;

		FoodTruck[] myTrucks = new FoodTruck[5];

		System.out.println("Welcome to the Food Truck Challenge!");
		do {
			for(int i = 0; i < myTrucks.length; i++) {
				
				FoodTruck truck = new FoodTruck();
				myTrucks[i] = truck;
				
				System.out.print("Food truck name: ");
				truck.setFoodTruckName(foodTruckName = sc.nextLine());
				
				if (foodTruckName.equalsIgnoreCase("quit")) {
					activeUser = false;
				}
				
				System.out.print("Food type: ");
				truck.setFoodType(foodType = sc.nextLine());
				
				System.out.print("Rating: ");
				truck.setTruckRating(truckRating = sc.nextInt());
				
			}
			
			
			
		} while (activeUser = true);

		sc.close();
		
	}


}
