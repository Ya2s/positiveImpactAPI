package com.ybouslim.positiveImpactAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybouslim.positiveImpactAPI.model.DonorProject;
import com.ybouslim.positiveImpactAPI.model.Donor;
import com.ybouslim.positiveImpactAPI.repository.DonationRepository;

import lombok.Data;

@Data
@Service
public class DonationService {
	
	@Autowired
	private DonationRepository repository;
	
	/* 
	 * Get donations donor
	 */
	public Iterable<DonorProject> getDonationsDonor(Donor donor) {
		return repository.findByDonor(donor);
	}
	
	
	
    public DonorProject saveDonation(DonorProject donation) {
        DonorProject savedDonation = repository.save(donation);
        return savedDonation;
    }
	
}
