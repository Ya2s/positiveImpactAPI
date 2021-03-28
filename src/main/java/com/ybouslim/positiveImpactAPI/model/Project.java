package com.ybouslim.positiveImpactAPI.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/*
 * All projects of the association Positive Impact.
 * A project is in progress if the donation_goal is not "atteint"
 * 
 */

@Data		
@Entity		
@Table(name="Project")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	
	private String description;
	
	private String country;
	
	private String city;
	
	// The value in € of donation required to realize the project 
	@Column(name="required_donation_value")
	private Integer requiredDonationValue; 
	
	@ManyToMany
	private List<ProjectCategory> categories;
	
	
	
	@OneToMany(mappedBy="project")
	private Set<DonorProject> donations;
	
	
	// Current total of donations to this project. The default value is 0 (= nobody give a donation).
	/* 
	 * FIXME : J'utilise un champ calculé, mais est-ce la bonne façon ? De plus il n'y a pas moyen d'attaquer direction le champ
	 * 'donations' sans passer par un requête qui parcourt toutes les donations ?... 
	 */
	@Formula("Select SUM(donation.value_euro) from Donor_Project donation where donation.project_id = id")
	private Integer donationsTotal = 0;	

}
