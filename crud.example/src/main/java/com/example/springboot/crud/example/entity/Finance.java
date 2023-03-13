package com.example.springboot.crud.example.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Finance {

	
	@NotNull(message="Finance lastname cannot be null")
	private String lastName;
}
