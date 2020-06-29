package com.fuwu.plm.shared.dto;

import java.util.List;
/**
 * 
 * @author wufuen
 *
 * @param <D>
 * 
 * Rest 接口调用失败是的返回类型
 */
public class FailureResponse<D> extends ApiResponse<D> {	
	private String message;
	private List<D> errors;
	public FailureResponse(){
		this.status="failure";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<D> getErrors() {
		return errors;
	}
	public void setErrors(List<D> errors) {
		this.errors = errors;
	}
	

}
