package com.ybouslim.positiveImpactAPI.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data		
@Entity		
@Table(name="Donor")
public class Donor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Basic
	@Column(name="birth_date")
	private Date birth_date;
	
	private String mail;
	
	private String password;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@OneToMany(mappedBy="donor")
	private Set<DonorProject> donations = new HashSet<>();
	
}
