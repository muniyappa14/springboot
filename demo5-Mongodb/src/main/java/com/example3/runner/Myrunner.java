package com.example3.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example3.Model.Employee;
import com.example3.repo.repo;

@RestController
public class Myrunner {
	@Autowired
	repo rp;
	
	@PostMapping("/insert")
	public String insertData(@RequestBody Employee emp) {
		rp.save(emp);
		return "data added";
	}
	@GetMapping("/getemp")
	public List<Employee> getemployee(){
		return rp.findAll();
	}
	@PutMapping("/updateemp/{id}")
	public void updemp(@PathVariable int id,@RequestBody Employee em) {
		Employee ids=rp.getByid(id);
		ids.setName(em.getName());
		ids.setSal(em.getSal());
		rp.save(ids);
	}
	@DeleteMapping("/delete/{id}")
	public String delemp(@PathVariable int id) {
		rp.deleteById(id);
		return "deleted";
	}
	}
