package com.example2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example2.mongo.Product;
@Repository
public interface Myrepository extends MongoRepository<Product, Integer> {

}
