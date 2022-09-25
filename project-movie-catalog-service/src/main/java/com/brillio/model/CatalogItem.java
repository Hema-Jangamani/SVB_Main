package com.brillio.model;

public class CatalogItem {
	
	private String movie;
	private int rating;
	
	public CatalogItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CatalogItem(String movie, int rating) {
		super();
		this.movie = movie;
		this.rating = rating;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	

}
