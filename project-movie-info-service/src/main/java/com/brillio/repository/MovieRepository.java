package com.brillio.repository;

import org.springframework.data.repository.CrudRepository;

import com.brillio.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, String>{
	
	public Movie findByName(String name);

}
