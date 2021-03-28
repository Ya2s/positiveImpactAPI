package com.ybouslim.positiveImpactAPI.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data		
@Entity		
@Table(name="Donor_Project")
public class DonorProject{
	
	@EmbeddedId
	private DonorProjectPK id;
	
	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private Donor donor;
	
	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private Project project;
	
	/* 
	 * /!\ les insertable=false et updatable=false probablement pour pas persister (ou créer) ces champs qui sont déjà 
	 *     persistés. De plus sans ça j'ai une erreur.
	 */
	
	
	@Column(name="value_euro")
	private Integer valueEuro;
	
	private String message;
		
}
