package com.capg.model.dao;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.capg.model.Trainee;

@Repository
public class DaoTrainee {
	
	static Map<Integer, Trainee> map=new HashMap<Integer, Trainee>();
	

	public Trainee addTrainee(Trainee t) {
	
		map.put(t.getId(), t);
		
		return t;
	}
	
	public Trainee findTrainee(int id) {
	Trainee t=	map.get(id);
	return t;
	}
	public int  deleteTrainee(int id) {

	map.remove(id);
	return id;

	

	
	}
	
	public List<Trainee> getAllTrainees()
	{
	
		return ((Collection<Trainee>) map).stream().collect(Collectors.toList());
		

	}
	
	public Trainee updateTrainee(Trainee t) {
		
	
		if(map.containsKey(t.getId()))
		{
		map.replace(t.getId(), t);
			
			return t;
			
		}
		else
			return null;
		
	}
}
	


	

	
	
	


