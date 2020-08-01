package com.eatza.restaurantsearch.dto;

public class RestaurantRequestDto {

	private String name;
	private String location;
	private String cuisine;
	private int budget;
	private double rating;
	private String activeFrom;
	private String activeTill;

	public RestaurantRequestDto() {
	}

	public RestaurantRequestDto(String name, String location, String cuisine, int budget, double rating,
			String activeFrom, String activeTill) {
		super();
		this.name = name;
		this.location = location;
		this.cuisine = cuisine;
		this.budget = budget;
		this.rating = rating;
		this.activeFrom = activeFrom;
		this.activeTill = activeTill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getActiveFrom() {
		return activeFrom;
	}

	public void setActiveFrom(String activeFrom) {
		this.activeFrom = activeFrom;
	}

	public String getActiveTill() {
		return activeTill;
	}

	public void setActiveTill(String activeTill) {
		this.activeTill = activeTill;
	}

}
