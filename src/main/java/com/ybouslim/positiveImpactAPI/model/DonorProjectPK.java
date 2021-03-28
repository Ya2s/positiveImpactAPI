package com.ybouslim.positiveImpactAPI.model;

import java.io.Serializable;

import javax.persistence.Column;

public class DonorProjectPK implements Serializable {

	private static final long serialVersionUID = -8252929212143119609L; 
	// Pas vraiment mais compris mais en gros pour être sûr plus tard de désérialiser le bon objet (donorprojectpk).
	// Et peut-être ici j'en ai besoin de Serializable car pas de @Entity au dessus ou quelque chose comme ça

	@Column(name="donor_id")
	private int idDonor;
	
	@Column(name="project_id")
	private int idProject;
	
}
