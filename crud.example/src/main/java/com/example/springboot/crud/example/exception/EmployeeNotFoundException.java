package com.example.springboot.crud.example.exception;

public class EmployeeNotFoundException extends   RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public EmployeeNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public EmployeeNotFoundException() {
		super();
	}
	
	
}
