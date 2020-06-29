package com.fuwu.plm.shared.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fuwu.plm.shared.dto.FailureResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		System.out.println("==========================");
		List<FieldValidationError> errors=new ArrayList<>();
		for(FieldError error:ex.getBindingResult().getFieldErrors()) {
			FieldValidationError validationError = new FieldValidationError(error.getField(),error.getDefaultMessage());
			errors.add(validationError);
		}
		ApiError<FieldValidationError> apiError=new ApiError<>(HttpStatus.BAD_REQUEST, "validation failed", errors);
		return handleExceptionInternal(ex, apiError, headers, apiError.getStatus(), request);
				
	}
	
	@ExceptionHandler(Exception.class)
	protected ResponseEntity<FailureResponse> handleOthers(){
		System.out.println("handleOthers");
		FailureResponse failureResponse=new FailureResponse<>();
		failureResponse.setMessage("系统错误,请联系系统管理员!");
		ResponseEntity responseEntity=new ResponseEntity<>(failureResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		return responseEntity;
	}
	
	
	
	

}
