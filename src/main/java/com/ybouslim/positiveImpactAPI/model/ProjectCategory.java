package com.ybouslim.positiveImpactAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/*
 * The different categories of projects are :
 * 	- Plant a tree
 *  - Give a education kit to children from poor families
 *  - Create a well
 */


@Data		
@Entity
@Table(name="Project_Category")
public class ProjectCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	
}
