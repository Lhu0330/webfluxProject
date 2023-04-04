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
@Table("tb_app_user_info")
public class TestDomain {
	@Id
	private String userId;
	private String addr;
	@Column("app_id")
	private String user;
	private String user1;
	
}
