package com.skilldistillery.foodtruck;

public class Voter {
	private String name;

	public Voter() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void getTrucks(FoodTruck[] trucks) {
		String myTrucks = "My trucks include: ";

		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
				myTrucks += trucks[i].getFoodTruckName();
			} else {
				continue;
			}

			System.out.println(myTrucks);

		}

	}

	public int getAverage(FoodTruck[] trucks) {
		int avgRating = 0;
		int sum = 0;

		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
				sum += trucks[i].getTruckRating();
			}
			avgRating = sum / i;
		}

		return avgRating;
	}

	public String getHighest(FoodTruck[] trucks) {
		String highest = "";
		int highRating = 0;

		for (int i = 0; i < trucks.length; i++) {
			if (highRating < trucks[i].getTruckRating()) {
				highRating = trucks[i].getTruckRating();
				
			}
			
		}
		
		return highest;

	}

}
