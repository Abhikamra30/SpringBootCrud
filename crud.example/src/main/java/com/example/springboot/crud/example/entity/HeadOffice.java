package com.example.springboot.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeadOffice {

	private String HeadOfficeManager;
	private String officeNum;
	private String officeEmployeeName;
	private Integer officeEmployee1;
	private String officeEmployeeLastName;
}
