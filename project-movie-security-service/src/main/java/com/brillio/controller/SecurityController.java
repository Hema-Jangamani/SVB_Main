package com.brillio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.brillio.model.Movie;
import com.brillio.model.Rating;
import com.brillio.model.UserRating;

@CrossOrigin(origins="http://127.0.0.1:5500", allowedHeaders = "*",allowCredentials = "true")
@RestController
@RequestMapping("/security")
public class SecurityController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/movies/{movieName}")//List<CatalogItem>
	public UserRating getRatingsByMovieName(@PathVariable String movieName){
		return restTemplate.getForObject("http://movie-catalog-service/catalog/movies/"+movieName,UserRating.class);
	}
	
	@RequestMapping("/user/{userId}")//List<CatalogItem>
	public List<Rating> getRatingOfUser(@PathVariable String userId){
		return restTemplate.getForObject("http://movie-catalog-service/catalog/user/"+userId,List.class);
	}
	
	@RequestMapping("/getAll")
	public List<Movie> getAllMovies(){
		return restTemplate.getForObject("http://movie-catalog-service/catalog/getAll",List.class);
	}

}
