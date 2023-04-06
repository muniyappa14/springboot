package com.example2.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example2.jpa.ConnectingDB;
import com.example2.repo.Productrepo;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	Productrepo prepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
      ConnectingDB db=new ConnectingDB();
db.setId(102);
db.setName("muni");
db.setColor("red");
prepo.save(db);
   
	}

}
