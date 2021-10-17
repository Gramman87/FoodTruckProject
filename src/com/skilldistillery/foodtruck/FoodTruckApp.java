package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		//Scanner, menu
		Scanner sc = new Scanner(System.in);
		boolean voting = true;
		int userIput = 0;
		
		String foodTruckName = "";
		String foodType = "";
		int truckRating = 0;
		
		System.out.println("Welcome to the Food Truck Challenge!");
				
		while(voting) {
			switch (userIput) {
			case 1:
				System.out.println("Please enter the following information.");
				System.out.print("Food truck name: ");
				foodTruckName = sc.nextLine();
				
				System.out.print("Food type: ");
				foodType = sc.nextLine();
				
				System.out.print("Rating: ");
				truckRating = sc.nextInt();
				
				FoodTruck(foodTruckName, foodType, truckRating);
				break;

			default:
				break;
			}
		}
		
		sc.close();

	}
	
	public void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|       1.Voting       |");
		System.out.println("|                      |");
		System.out.println("|       2.Exit         |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

}
