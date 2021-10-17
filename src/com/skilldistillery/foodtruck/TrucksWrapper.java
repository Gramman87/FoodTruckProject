package com.skilldistillery.foodtruck;

public class TrucksWrapper {
	private FoodTruck[] trucks;
	private int index;

	public TrucksWrapper(int numTrucks) {
		this.trucks = new FoodTruck[numTrucks];
		index = 0;
	}

	public void truckInput(FoodTruck truck) {
		if (index < trucks.length) {
			trucks[index] = truck;
			index++;
		} else {
			System.err.println("TrucksWrapper is full... sorry!");
		}

	}

	public void printTrucks() {

		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
				System.out.println(trucks[i].toString());
			}

		}

	}

	public double getAverage() {
		double avgRating = 0;

		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != (null)) {
				avgRating += trucks[i].getTruckRating();
			}

		}
		avgRating /= index;

		return avgRating;
	}

	public String getHighest() {
		int temp = 0;
		String highest = "";

		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null && trucks[i].getTruckRating() > temp) {
				temp = trucks[i].getTruckRating();
				highest = trucks[i].getFoodTruckName();

			}

		}

		return highest;

	}

}
