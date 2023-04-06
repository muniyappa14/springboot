package com.example2.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
private Integer pid;
private String pname;
private Integer prize;
private String color;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Integer getPrize() {
	return prize;
}
public void setPrize(Integer prize) {
	this.prize = prize;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Product() {
	super();
}

}
