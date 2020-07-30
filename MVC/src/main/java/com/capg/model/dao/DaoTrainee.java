package com.capg.model.dao;

import java.util.HashMap;
import java.util.Map;

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
	public Trainee deleteTraine(int id) {
		Trainee t=map.remove(id);
		return t;
	}

}
