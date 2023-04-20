package com.example3.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example3.Model.Employee;
@Repository
public interface repo extends MongoRepository<Employee, Integer> {
    Employee getByid(int id);
     
}
