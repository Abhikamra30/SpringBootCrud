package com.example.springboot.crud.example.exception;

public class EmployeeAlreadyExistingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public EmployeeAlreadyExistingException(String message) {
		super();
		this.message = message;
	}
	public EmployeeAlreadyExistingException() {
		super();
	}
	
	
}
