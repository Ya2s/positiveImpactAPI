package com.ybouslim.positiveImpactAPI.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ybouslim.positiveImpactAPI.model.DonorProject;
import com.ybouslim.positiveImpactAPI.model.Donor;
import com.ybouslim.positiveImpactAPI.service.DonationService;
import com.ybouslim.positiveImpactAPI.service.DonorService;

@RestController
public class DonationController {
	
	@Autowired
	private DonationService service;
	
	//TODO : cf Trello
	@Autowired
	private DonorService serviceDonor;
	
	
	@GetMapping("/donations/{idDonor}")
	public Iterable<DonorProject> getDonationsDonor(@PathVariable("idDonor") final Long id) {
		
		Optional<Donor> donor = serviceDonor.getDonor(id);
		
		if (donor.isPresent()){		
			return service.getDonationsDonor(donor.get());
		}
		else {
			return null;
		}
		//TODO : C'est mieux de passer par une URL "/donations/" (ID en cookie ou autre mais ne se voit pas)
		
	}
	

}
