package com.example.demo.udms.citizen.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("tb_app_user_info")
public class CitizenDomain {
	
	@Column("app_id")
	private String idx;
	
	@Column("user_nm")
	private String name;
	
	@Column("addr")
	private String address;
	
//	private String addressDetail;
	
//	private String addressNative;
	
	@Column("birthday")
	private String birthDate;
	
	private String tel;

}
