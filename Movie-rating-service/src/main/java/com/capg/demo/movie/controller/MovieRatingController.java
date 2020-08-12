package com.capg.demo.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieRating;
import com.capg.demo.movie.service.MovieRatingService;

@RestController
public class MovieRatingController {
@Autowired
MovieRatingService service;
@PostMapping("/rating")
	public MovieRating addMovie(@RequestBody MovieRating rating) {
		return service.addMovieRating(rating);
	}

@GetMapping("/rating/{id}")
public MovieRating getMovie(@PathVariable("id") int id) {
	return service.getMovieRating(id);
}
	
@GetMapping("/rating")
public List<MovieRating> getAllMovieRating(){
	return service.getAllMovieRating();
}
	
@PutMapping("/rating")
public MovieRating updateRating(@RequestBody MovieRating rating) {

	return service.updateMovieRating(rating);
}
@DeleteMapping("/rating/{id}")
public String deleteMovie(@PathVariable("id") int id) {
	service.deleteMovieRating(id);
	return "deleted succesfully";
}
}