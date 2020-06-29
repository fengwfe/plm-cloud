package com.fuwu.plm.admin.controller;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class User implements Serializable {
	
	@Length(max=6,message="最大长度为6")
	@NotBlank(message="user name不能为空")
	private String name;
	@Valid
	private Address myAddr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getMyAddr() {
		return myAddr;
	}

	public void setMyAddr(Address myAddr) {
		this.myAddr = myAddr;
	}
	
	

}
