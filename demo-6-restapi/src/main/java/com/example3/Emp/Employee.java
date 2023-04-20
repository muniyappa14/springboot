package com.example3.Emp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Document
@Setter
@Getter
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	private String ename;
	private Integer esal;
	private String eemail;

}
