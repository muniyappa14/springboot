package com.example2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example2.product.Product;
@Repository
public interface Productrepo extends JpaRepository<Product, Integer> {

}
