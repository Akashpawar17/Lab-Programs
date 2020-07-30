package com.capg.model.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.model.Trainee;
import com.capg.model.service.ServiceTrainee;

@Controller
public class TraineeController {
	@Autowired
	ServiceTrainee service;
	
	
	@GetMapping("/login")
	public String login(@RequestParam("uname") String uname,@RequestParam("password") String password, Model m) {
		


		
		if(uname.equals("akash")&password.equals("12345")) {
			m.addAttribute("uname" ,uname);
			m.addAttribute("password" ,password);
			
			
			return "show";

		}
		
		return "login";
	
	}
	@PostMapping("/add")
	public String addTrainee(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("domain") String domain,@RequestParam("location") String location,Model m) throws SQLException {
Trainee trainee=new Trainee(id,name,domain,location);
service.addTrainee(trainee);
m.addAttribute("trainee", trainee);
return "add-trainee";

		
		
	}
	@GetMapping("/find")
	public String findTrainee(@RequestParam("id") int id,Model m) throws SQLException {
		Trainee trainee=service.findTrainee(id);
		m.addAttribute("trainee",trainee);
		return "find-trainee";
		
	}
	
	@DeleteMapping("/remove")
	public String deleteTrainee(@RequestParam("id") int id,Model m) throws SQLException {
		Trainee trainee=service.deleteTrainee(id);
		m.addAttribute("trainee",trainee);
		return "delete-trainee";
		
	}
}
	
	
	
	



