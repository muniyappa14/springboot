package com.example2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example2.product.Product;
import com.example2.repository.Productrepo;
@Service
public class Pservice {
@Autowired
Productrepo prep;

public List<Product> getproduct(){
	 return prep.findAll();
}
public void insertdata( Product product) {
	prep.save(product);
}
public void delete() {
	prep.deleteAll();
}
}
