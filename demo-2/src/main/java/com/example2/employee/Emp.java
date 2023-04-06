package com.example2.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Emp implements EmpImpl {
	
@Autowired
private JdbcTemplate jt;

	@Override
	public void insertdata() {
		
		   String st="insert into info values(101,'muni')";
		   jt.update(st);
		   System.out.println("connected");
		
		
	}

	@Override
	public List fetchdata() {
		// TODO Auto-generated method stub
		List l=jt.queryForList("select * from info");
		return l;
	}

}
