package com.example2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example2.jpa.ConnectingDB;

public interface Productrepo extends JpaRepository<ConnectingDB,Integer> {

}
