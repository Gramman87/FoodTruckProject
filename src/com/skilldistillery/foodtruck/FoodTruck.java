package com.skilldistillery.foodtruck;

public class FoodTruck {
	private static int foodTruckId = 0000;
	private String foodTruckName;
	private String foodType;
	private int TruckRating;
	
	public FoodTruck(String foodTruckName, String foodType, int truckRating) {
		this.foodTruckId++;
		this.foodTruckName = foodTruckName;
		this.foodType = foodType;
		TruckRating = truckRating;
	}

	public static int getFoodTruckId() {
		return foodTruckId;
	}

	public static void setFoodTruckId(int foodTruckId) {
		FoodTruck.foodTruckId = foodTruckId;
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
		return TruckRating;
	}

	public void setTruckRating(int truckRating) {
		TruckRating = truckRating;
	}
	
	

}
