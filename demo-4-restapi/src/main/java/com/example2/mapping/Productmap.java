package com.example2.mapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example2.product.Product;
import com.example2.service.Pservice;

@RestController
public class Productmap {
@Autowired
Pservice pmap;
@GetMapping("/getproduct")
public List<Product> plist(){
	return pmap.getproduct();
}
@PostMapping("/add")
public void addproduct(@RequestBody Product product ) {
	pmap.insertdata(product);
}
@DeleteMapping("/delete")

public void deletdata() {
	pmap.delete();
}
}
