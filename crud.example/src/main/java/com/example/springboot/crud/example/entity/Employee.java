package com.example.springboot.crud.example.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emp_Id;
	
	@NotEmpty(message = "Name is required")
	private String firstName;
	
	@NotEmpty(message="Email is required")
	private String email;
	
	@NotEmpty(message="Last Name is required")
	@Size(max=10,min=3,message="The last name cannot be more than 10 and less than 3")
	private String lastName;
	
	@DecimalMin(message="The salalry should be positive", value = "0.00")
	@DecimalMax(message="The salary cannot be more than 300",value ="300.0")
	private BigDecimal salary;
	
	@NotNull(message="Age is required")
	@Max(value=50,message="Age cannot be more than 50" )
	@Min(value=6,message="Age cannot be less than 6")
	private Integer age;
}
