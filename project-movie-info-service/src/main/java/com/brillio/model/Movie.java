package com.brillio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movietable")
public class Movie {
	
	@Id
	private String movieId;
	
	@Column(name = "MovieName")
	private String name;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name =name;
	}
	
	

}
