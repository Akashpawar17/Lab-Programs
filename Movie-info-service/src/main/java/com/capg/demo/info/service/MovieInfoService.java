package com.capg.demo.info.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.info.model.MovieCatlog;
import com.capg.demo.info.model.MovieInfo;
import com.capg.demo.info.model.MovieRating;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MovieInfoService {
	@Autowired
	RestTemplate rt;
	
	/*@Value("${rating-Get-Uri}")
  private 	String ratingGetUri;
	@Value("${catlog-Get-Uri}")
	private String catlogGetUri;
	
	
	
	public String getRatingGetUri() {
		return ratingGetUri;
	}

	public void setRatingGetUri(String ratingGetUri) {
		this.ratingGetUri = ratingGetUri;
	}

	public String getCatlogGetUri() {
		return catlogGetUri;
	}

	public void setCatlogGetUri(String catlogGetUri) {
		this.catlogGetUri = catlogGetUri;
	}
*/
	@HystrixCommand(fallbackMethod="getCatlogInfoFallBack")
	public MovieInfo getCatlogInfo(int id)
	{
	/*MovieCatlog catlog=	rt.getForObject("http://MOVIE-CATLOG-SERVICE/"+catlogGetUri+""+id, MovieCatlog.class);
	MovieRating rating=rt.getForObject("http://MOVIE-RATING-SERVICE/"+ratingGetUri+""+id, MovieRating.class);
*/	
		
		MovieCatlog catlog=	rt.getForObject("http://MOVIE-CATLOG-SERVICE/catlog/"+id, MovieCatlog.class);
		//MovieRating rating=rt.getForObject("http://MOVIE-RATING-SERVICE/rating/"+id, MovieRating.class);

		MovieInfo info=new MovieInfo();
		info.setId(catlog.getId());
		info.setmovieName(catlog.getmovieName());
	info.setGetCatlogPort(catlog.getPort());
	//info.setGetRatingPort(rating.getPort());
	return info;
	}
	@HystrixCommand(fallbackMethod="getRatingInfoFallBack")
	public MovieInfo getRatingInfo(int id)
	{
	/*MovieCatlog catlog=	rt.getForObject("http://MOVIE-CATLOG-SERVICE/"+catlogGetUri+""+id, MovieCatlog.class);
	MovieRating rating=rt.getForObject("http://MOVIE-RATING-SERVICE/"+ratingGetUri+""+id, MovieRating.class);
*/	
		
		//MovieCatlog catlog=	rt.getForObject("http://MOVIE-CATLOG-SERVICE/catlog/"+id, MovieCatlog.class);
		MovieRating rating=rt.getForObject("http://MOVIE-RATING-SERVICE/rating/"+id, MovieRating.class);

		MovieInfo info=new MovieInfo();
		info.setId(rating.getId());
		info.setRating(rating.getRating());
	//info.setGetCatlogPort(catlog.getPort());
	info.setGetRatingPort(rating.getPort());
	return info;
	}
	public MovieInfo getCatlogInfoFallBack(int id) {
		return new MovieInfo(id,"jumanji",8.6);
	}
	
	public MovieInfo getRatingInfoFallBack(int id) {
		return new MovieInfo(id,"robo",2.0);
	}
	
	public MovieInfo addMovieInfo(MovieInfo info)
	{
	MovieCatlog catlog=	new MovieCatlog(info.getId(),info.getmovieName());
	MovieRating rating=new MovieRating(info.getId(),info.getRating());
	catlog=rt.postForObject("http://MOVIE-CATLOG-SERVICE/catlog/", catlog, MovieCatlog.class);
	
	rating=rt.postForObject("http://MOVIE-RATING-SERVICE/rating/",rating, MovieRating.class);
	
	info =new MovieInfo(info.getId(),info.getmovieName(),info.getRating());
	info.setGetCatlogPort(catlog.getPort());
	info.setGetRatingPort(rating.getPort());

	return info;
	}
	
	public void deleteMovieInfo(int id) {
		rt.delete("http://MOVIE-CATLOG-SERVICE/catlog/"+id);
		rt.delete("http://MOVIE-RATING-SERVICE/rating/"+id);
	
		
	}
	
	public MovieInfo updateMovieInfo(MovieInfo info)
	{
	MovieCatlog catlog=	new MovieCatlog(info.getId(),info.getmovieName());
	MovieRating rating=new MovieRating(info.getId(),info.getRating());
	catlog=rt.postForObject("http://MOVIE-CATLOG-SERVICE/catlog/", catlog, MovieCatlog.class);
	
	rating=rt.postForObject("http://MOVIE-RATING-SERVICE/rating/",rating, MovieRating.class);
	
	info =new MovieInfo(info.getId(),info.getmovieName(),info.getRating());
	info.setGetCatlogPort(catlog.getPort());
	info.setGetRatingPort(rating.getPort());

	return info;
	}
	public List<MovieInfo> getAllCatlogInfo()
	{
	
		
ResponseEntity<List<MovieCatlog>> catlog=rt.exchange("http://MOVIE-CATLOG-SERVICE/catlog/", HttpMethod.GET, null,new  ParameterizedTypeReference<List<MovieCatlog>>() {});
//ResponseEntity<List<MovieRating>> rating=rt.exchange("http://MOVIE-CATLOG-SERVICE/rating/", HttpMethod.GET, null,new  ParameterizedTypeReference<List<MovieRating>>() {});

return null;



	}
}
 