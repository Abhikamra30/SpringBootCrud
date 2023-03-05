package com.example.springboot.crud.example.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot.crud.example.entity.Employee;
import com.example.springboot.crud.example.service.EmployeeService;

@RestController
public class EnployeeController {

	@Autowired
	private EmployeeService empService;
	
	@PostMapping(path="/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody  @Valid Employee emp){
		Employee employee= empService.addEmployee(emp);
			return new ResponseEntity<>(employee,HttpStatus.CREATED);
	}
	@PostMapping(path="/addEmployees")
	public ResponseEntity<List<Employee>> addEmployees(@RequestBody @Valid List<Employee> emps){
		List<Employee> empList=empService.addEmployees(emps);
		return new ResponseEntity<>(empList,HttpStatus.CREATED);
	}
	
	@GetMapping("/findemployee/{id}")
	public ResponseEntity<Employee> findEmployee(@PathVariable int id){
		return new ResponseEntity<>(empService.findbyId(id),HttpStatus.OK);
	}

	@GetMapping("/findemployeebyname/{name}")
	public ResponseEntity<Employee> findByName(@PathVariable String name){
		return new ResponseEntity<>(empService.findbyName(name),HttpStatus.OK);
	}
	
	@PatchMapping("/updateEmployee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody @Valid Employee emp){
		return new ResponseEntity<Employee>(empService.updateEmployee(emp),HttpStatus.OK);
	}
	

	
	/*@ExceptionHandler({UserNotFoundException.class})
	public ResponseEntity<Object> handleUserNotFoundException( UserNotFoundException ex
			,HttpStatus status,HttpHeaders headers){
		
		Map<String,Object> body=new HashMap<>();
		body.put("errorMessage",ex.getMessage());
		return new ResponseEntity<Object>("Message",headers,HttpStatus.BAD_REQUEST);
		
	}*/
	
	 /* @ExceptionHandler({ UserNotFoundException.class })
	    public ResponseEntity<Object> handleNoSuchCustomerExistsException(
	    		UserNotFoundException ex, WebRequest request) {
		  Map<String,Object> body=new HashMap<>();
			body.put("errorMessage",ex.getMessage());
		  return new ResponseEntity<Object>(
				  body , new HttpHeaders(), HttpStatus.FORBIDDEN);
	    }*/
	
	
}
