package com.capg.demo.catlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.capg.demo.catlog.dao.MovieCatlogDao;
import com.capg.demo.catlog.model.MovieCatlog;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@Service
public class MovieCatlogService {

	
	@Autowired
	MovieCatlogDao repo;
	
	@Autowired
	Environment envirom;
	
	public  int getPortNo() {
		return Integer.parseInt(envirom.getProperty("local.server.port"));
		
	}
	
	public MovieCatlog addCatlog(MovieCatlog catlog) {
		MovieCatlog savedCatlog= repo.save(catlog);
		savedCatlog.setPort(getPortNo());
		return savedCatlog;
	}
	
	public MovieCatlog getCatlog(int id) {
		MovieCatlog savedCatlog= repo.getOne(id);
		savedCatlog.setPort(getPortNo());
		System.out.println(savedCatlog);
		return savedCatlog;
	}
	
	public  void deleteCatlog(int id) {
		
		 repo.deleteById(id);
	
	}
	public List<MovieCatlog> getAllCatlog(){
		
	List<MovieCatlog> catlog= repo.findAll();


	return catlog;
	
		
	}
	
	
	public MovieCatlog updateCatlog(MovieCatlog catlog) {
	MovieCatlog savedcatlog=	repo.getOne(catlog.getId());
	savedcatlog.setmovieName(catlog.getmovieName());
savedcatlog.setPort(getPortNo());
	return repo.save(savedcatlog);
	
	}
}
