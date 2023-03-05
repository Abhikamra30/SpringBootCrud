/*package com.example.springboot.crud.example.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalException2 extends ResponseEntityExceptionHandler {

	@Override
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		Map<String, Object> body= new HashMap<>();
		
		body.put("errors", ex.getBindingResult().getFieldErrors().stream().map(FieldError::getDefaultMessage)
				.collect(Collectors.toList()));
		return new ResponseEntity<Object>(body,headers,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException( UserNotFoundException ex
			,HttpStatus status,HttpHeaders headers){
		
		Map<String,Object> body=new HashMap<>();
		body.put("errorMessage",ex.getMessage());
		return new ResponseEntity<Object>(body,headers,HttpStatus.BAD_REQUEST);
		
	}
	
	 @ExceptionHandler({ UserNotFoundException.class })
	    public ResponseEntity<Object> handleNoSuchCustomerExistsException(
	    		UserNotFoundException ex, WebRequest request) {
		  Map<String,Object> body=new HashMap<>();
			body.put("errorMessage",ex.getMessage());
		  return new ResponseEntity<Object>(
				  body , new HttpHeaders(), HttpStatus.BAD_REQUEST);
	    }
}
*/