package com.example2.Myrunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example2.mongo.Product;
import com.example2.repository.Myrepository;
@RestController
public class Myrunner  {
@Autowired
Myrepository myrepo;
	 @PostMapping("/insertdata")
	 public String data( @RequestBody Product pd) {
		 myrepo.save(pd);
		 return "data added";
	 }
}
