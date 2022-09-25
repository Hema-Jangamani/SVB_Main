package com.brillio.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.brillio.model.CatalogItem;
import com.brillio.model.Movie;
import com.brillio.model.Rating;
import com.brillio.model.UserRating;

@CrossOrigin
@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/getAll")
    public List<Movie> getAllMovies(){
       return restTemplate.getForObject("http://movie-info-service/movies/getAll",List.class);
    }
	
	@RequestMapping("/user/{userId}")
	public List<Rating> getRatingOfUser(@PathVariable String userId){
		return restTemplate.getForObject("http://rating-data-service/rating/user/"+userId,List.class);
	}
	
	@RequestMapping("/movie/{movieId}")
	public CatalogItem getRatingOfMovie(@PathVariable String movieId){
		UserRating ratList=restTemplate.getForObject("http://rating-data-service/rating/movie/"+movieId,UserRating.class);
		Movie movie= restTemplate.getForObject("http://movie-info-service/movies/" + ratList.getRatings().get(0).getMovieId(),Movie.class);
		int overallRating=ratList.getRatings().stream().map(Rating::getRating).reduce((int) 0.0,(r1,r2)->r1+r2);
		return new CatalogItem( movie.getName(),overallRating/ratList.getRatings().size());
	}
	
	@RequestMapping("/movies/{movieName}")
	public UserRating getRatingsByMovieName(@PathVariable String movieName){
		Movie movie=restTemplate.getForObject("http://movie-info-service/movies/movieName/"+movieName,Movie.class);
		return restTemplate.getForObject("http://rating-data-service/rating/movie/"+movie.getMovieId(),UserRating.class);
	}
}
