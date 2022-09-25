package com.brillio.model;

import java.util.List;

public class UserRating {

	private List<Rating> ratings;
	
	public UserRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRating(List<Rating> ratings) {
		super();
		this.ratings = ratings;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
	
	
}
