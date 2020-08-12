package com.capg.demo.catlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.catlog.model.MovieCatlog;
import com.capg.demo.catlog.service.MovieCatlogService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;




@RestController
public class MovieCatlogController {
	
	@Autowired
	MovieCatlogService service;
	
@GetMapping("/catlog/{id}")
//@HystrixCommand(fallbackMethod="getMovieInfoFallBack")
	public MovieCatlog getMovieInfo(@PathVariable("id") int id) throws InterruptedException {
	//Thread.sleep(5000);
	return service.getCatlog(id);
}

public MovieCatlog getMovieInfoFallBack(@PathVariable("id") int id) {
	return new MovieCatlog(id, "war");
}

@PostMapping("/catlog")
public MovieCatlog addMovieInfo(@RequestBody MovieCatlog catlog) {
return service.addCatlog(catlog);
}
@DeleteMapping("/catlog/{id}")
public void deleteCatlog(@PathVariable("id") int id) {
	service.deleteCatlog(id);
}
@GetMapping("/catlog")
public List<MovieCatlog> getAllMovieCatlog(){
	return service.getAllCatlog();
}
@PutMapping("/catlog")
public MovieCatlog updateCatlog(@RequestBody MovieCatlog catlog) {
	return service.updateCatlog(catlog);
}
	
	
	
}
