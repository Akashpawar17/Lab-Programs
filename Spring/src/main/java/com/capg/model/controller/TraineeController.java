package com.capg.model.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.model.Trainee;
import com.capg.model.service.ServiceTrainee;

@Controller
public class TraineeController {
	@Autowired
	ServiceTrainee service;

	@GetMapping
	public String getMessage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("uname") String uname, @RequestParam("password") String password, Model m) {

		if (uname.equals("akash") & password.equals("12345")) {
			m.addAttribute("uname", uname);
			m.addAttribute("password", password);

			return "show";

		} else {

			return "login";
		}
	}

	@PostMapping("/add")
	public String addTrainee(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("domain") String domain, @RequestParam("location") String location, Model m) {
		Trainee trainee = new Trainee(id, name, domain, location);
		service.addTrainee(trainee);
		
		m.addAttribute("trainee", trainee);
		m.addAttribute("message", "trainee added successfully");
		
		return "display";
	}
	

	@GetMapping("/find")
	public String findTrainee(@RequestParam("id") int id, Model m) {
		Trainee trainee = service.findTrainee(id);
		m.addAttribute("tranee", trainee);
		m.addAttribute("message", "tarinee found  with this id ");
		
		return "display";

	}

	@GetMapping("/remove")

	public String deleteTrainee(@RequestParam("id") int id, Model m) {
	
		m.addAttribute("id", "trainee deleted succesfully");

		service.deleteTrainee(id);
		return "display";

	}

	@GetMapping("/findAll")
	public String findAllTrainees(Model m) {
		List<Trainee> traineeList = service.findAllTrainees();
		if (traineeList.isEmpty()) {
			m.addAttribute("message", " No Trainees Found");
			return "show";
		} else {
			m.addAttribute("traineelist", traineeList);
			return "findAll";
		}
	}

	/*@PostMapping("/update")
	public String modifyTrainee(@RequestParam("id") int id, Model m) {
		m.addAttribute("trainee", service.findTrainee(id));
		return "update-trainee";
	}
	*/
	
	@PostMapping("/update")
	public String updateTrainee(@ModelAttribute Trainee t, Model m)
	{
		Trainee tr =service.updateTrainee(t);
		if(tr!=null)
		{
		m.addAttribute("traineeid", tr.getId());
		m.addAttribute("message", "updated successfullly");
		
		return "update-trainee";	
		}
		else
		{
			m.addAttribute("traineeid", t.getId());
			m.addAttribute("operation", " Not Found");
return "update-trainee";
		}
	}
}
