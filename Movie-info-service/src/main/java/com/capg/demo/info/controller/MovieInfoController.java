package com.capg.demo.info.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.info.model.MovieInfo;
import com.capg.demo.info.service.MovieInfoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MovieInfoController {
	
	@Autowired
	MovieInfoService service;
	
	@GetMapping("/infoc/{id}")
	
	
	public MovieInfo getCatlogInfo(@PathVariable("id") int id) {
		
		return service.getCatlogInfo(id);
	}
	
	
@GetMapping("/infor/{id}")
	
	
	public MovieInfo getRatingInfo(@PathVariable("id") int id) {
		
		return service.getRatingInfo(id);
	}
	
@PostMapping("/info")
	
	public MovieInfo addMovieInfo(@RequestBody MovieInfo info) {
		return service.addMovieInfo(info);
	}


@DeleteMapping("/info/{id}")
public String  deleteMovieInfo(@PathVariable("id") int id) {
	service.deleteMovieInfo(id);
	return "deleted succesfully";
}

@PutMapping("/info")

public MovieInfo updateMovieInfo(@RequestBody MovieInfo info) {
	return service.updateMovieInfo(info);
}

@GetMapping("info")
public List<MovieInfo> getAllMovieInfo(){
	return service.getAllCatlogInfo();
}

}
