package io.fluffy.moviecatalogservice.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.fluffy.moviecatalogservice.model.CatalogItem;
import io.fluffy.moviecatalogservice.model.Movie;
import io.fluffy.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{movieId}")
	public List<CatalogItem> getCatalogItem(@PathVariable("movieId") String movieId){
//		return Collections.singletonList(new CatalogItem("Spiderman","Animated movie",4));
		
		UserRating ratings =restTemplate.getForObject("http://rating-data-service/ratingsdata/users/"+movieId,UserRating.class);
		return ratings.getRatings().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieID(),Movie.class);
			return new CatalogItem(movie.getName(),"Transformers Description",rating.getRating());
		}).collect(Collectors.toList());
	
	}

}
