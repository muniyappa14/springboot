package com.example3.Erepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example3.Emp.Employee;
@Repository
public interface EmpRepository extends MongoRepository<Employee, String> {

}
