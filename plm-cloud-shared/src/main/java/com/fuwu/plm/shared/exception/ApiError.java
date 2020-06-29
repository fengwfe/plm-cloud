package com.fuwu.plm.shared.exception;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiError<E> implements Serializable{
	private HttpStatus status;
	private String message;
	private List<E> errors;
	public ApiError(HttpStatus status,String message,List<E> errors) {
		this.status=status;
		this.message=message;
		this.errors=errors;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<E> getErrors() {
		return errors;
	}
	public void setErrors(List<E> errors) {
		this.errors = errors;
	}
	
}
