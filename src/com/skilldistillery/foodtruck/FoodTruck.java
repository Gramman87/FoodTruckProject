package com.skilldistillery.foodtruck;

public class FoodTruck {
	private static int numOfTrucks = 0000;
	private int truckId;
	private String foodTruckName;
	private String foodType;
	private int truckRating;

	public FoodTruck() {
		numOfTrucks++;
	}
	
	public int getFoodTruckId() {
		return truckId;
	}

	public void setFoodTruckId() {
		truckId = numOfTrucks;
	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int rating) {
		truckRating = rating;
	}

	public String toString() {
		return "FoodTruck [Truck Name: " + foodTruckName + ", Food Type: " + foodType + ", Truck Rating: "
				+ truckRating + ", Truck ID: " + truckId + "]";
	}

}
