package com.fuwu.plm.admin.controller;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

public class Address implements Serializable {
@Length(max=3,message="地址最长3")
 private String location;

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}
 
}
