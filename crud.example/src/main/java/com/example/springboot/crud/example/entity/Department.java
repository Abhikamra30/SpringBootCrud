package com.example.springboot.crud.example.entity;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	@NotNull(message="Depat name cannot be null")
	private String depName;
	@NotNull(message="Depat name cannot be null")
	private Integer depNo;
	@Valid
	private Finance finance;
	private String deptManagerName;
	private Integer deptManagerNum;
}
