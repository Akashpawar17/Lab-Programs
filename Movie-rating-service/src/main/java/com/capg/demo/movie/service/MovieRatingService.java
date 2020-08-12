package com.capg.demo.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.capg.demo.movie.model.MovieRating;
import com.capg.demo.movie.repo.MovieRatingRepo;

@Service
public class MovieRatingService {

	
	@Autowired
	MovieRatingRepo repo;
	@Autowired
	Environment envirom;
	
	public  int getPortNo() {
		return Integer.parseInt(envirom.getProperty("local.server.port"));
		
	}
	
	
	
	
	
	
	
	
	public MovieRating addMovieRating(MovieRating rating) {
		MovieRating savedRating=	 repo.save(rating);
		savedRating.setPort(getPortNo());
		return savedRating;
	}
	
	public MovieRating getMovieRating(int id) {
		MovieRating savedRating= repo.getOne(id);
		savedRating.setPort(getPortNo());
		return savedRating;
	}
	public void deleteMovieRating(int id) {
	repo.deleteById(id);
		
	}
	
	public List<MovieRating> getAllMovieRating(){
		return repo.findAll();
	}
	
	
	public MovieRating updateMovieRating(MovieRating rating) {
		MovieRating savedRating= repo.getOne(rating.getId());
	
	savedRating.setRating(rating.getRating());
	savedRating.setPort(getPortNo());

	return repo.save(savedRating);
	}
	
}
