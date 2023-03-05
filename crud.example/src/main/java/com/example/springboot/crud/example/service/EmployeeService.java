package com.example.springboot.crud.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.crud.example.entity.Employee;
import com.example.springboot.crud.example.exception.EmployeeNotFoundException;
import com.example.springboot.crud.example.exception.UserNotFoundException;
import com.example.springboot.crud.example.repository.EmployeeRepository;

@Service	
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepos;
	
	public Employee addEmployee(Employee employee){
		
		
		return empRepos.save(employee);
	}
	
	public List<Employee> addEmployees(List<Employee> emps){

		return empRepos.saveAll(emps);
	}
	
	public Employee findbyId( int id){
		return empRepos.findById(id).orElseThrow(()->new EmployeeNotFoundException
				("Employee with id "+id+" is not found"));
	}

	public Employee findbyName( String name){
		Employee retEmployee=empRepos.findByFirstName(name);
		if(retEmployee!=null){
			return retEmployee;
		}
		else{
			throw new EmployeeNotFoundException(" Employee with name "+name+" is not found" );
		}
	}
	
	public Employee updateEmployee(Employee emp){
		
		Employee retEmployee =empRepos.findById(emp.getEmp_Id()).orElse(null);
		if(retEmployee==null){
			throw new EmployeeNotFoundException(" Employee with id "+emp.getEmp_Id()+" is not found cannot be updated");
		
		 }
		else{
			retEmployee.setAge(emp.getAge());
			retEmployee.setEmail(emp.getEmail());
			retEmployee.setFirstName(emp.getFirstName());
			retEmployee.setLastName(emp.getLastName());
			retEmployee.setSalary(emp.getSalary());
			empRepos.save(retEmployee);
			return retEmployee;
			
			
		}
	}

}
