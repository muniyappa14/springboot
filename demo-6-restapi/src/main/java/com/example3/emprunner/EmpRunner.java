package com.example3.emprunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example3.Emp.Employee;
import com.example3.Eservice.Empservice;

@RestController
public class EmpRunner {
@Autowired
Empservice eserv;

@PostMapping("/addemp")
public void empdata(@RequestBody Employee emp1 ) {
	eserv.insertEmployee(emp1);
}

}