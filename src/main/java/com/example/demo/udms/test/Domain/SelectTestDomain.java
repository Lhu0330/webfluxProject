package com.example.demo.udms.test.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelectTestDomain {
	@Id
	private String id;
	@Column
	private String name;
	@Column
	private int value;
	@Column
	private int floPop;	
}
