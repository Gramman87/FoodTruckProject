package com.skilldistillery.foodtruck;

public class TrucksWrapper {
	private FoodTruck [] trucks;
	private int indexs;
	
	public TrucksWrapper(int numTrucks) {
		this.trucks = new FoodTruck[numTrucks];
		indexs = 0;
	}
	
	public void truckInput(FoodTruck truck) {
		
	}

	public void getTrucks() {

		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] == null) {
				continue;
			} else {
				System.out.println(trucks[i].toString());
			}

		}

	}

	public double getAverage() {
		double avgRating = 0;

		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i].equals(null)) {
				break;
			}
			avgRating += trucks[i].getTruckRating();
		}
		avgRating /= trucks.length;

		return avgRating;
	}

	public String getHighest() {
		String highest;
		String highTruck = "";
		int highRating = 0;

		for (int i = 0; i < trucks.length; i++) {
			if (highRating < trucks[i].getTruckRating()) {
				highRating = trucks[i].getTruckRating();
				highTruck = trucks[i].getFoodTruckName();

			}

		}
		highest = highTruck + ", with a rating of: " + highRating;
		
		return highest;

	}

	public void finalMenu() {

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

	}
	
}
