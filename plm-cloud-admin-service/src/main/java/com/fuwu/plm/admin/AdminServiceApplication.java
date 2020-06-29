package com.fuwu.plm.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.fuwu.plm.shared.exception.GlobalExceptionHandler;

@SpringBootApplication  
@Import(GlobalExceptionHandler.class)
public class AdminServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdminServiceApplication.class, args);
	}

}
