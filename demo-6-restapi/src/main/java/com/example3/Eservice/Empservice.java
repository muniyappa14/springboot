package com.example3.Eservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example3.Emp.Employee;
import com.example3.Erepository.EmpRepository;

@Service
public class Empservice {
@Autowired
EmpRepository erepo;

public void insertEmployee(Employee emp){
	erepo.save(emp);
}


}

