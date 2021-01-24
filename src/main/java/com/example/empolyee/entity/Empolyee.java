package com.example.empolyee.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empolyee")
public class Empolyee {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long empolyeeId;
	private String firstName;
	private String lastName;
	private String emailId;
	private Long age;
	private String gender;
	private String address;
	
	
}
