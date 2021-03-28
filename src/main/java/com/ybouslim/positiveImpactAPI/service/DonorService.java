package com.ybouslim.positiveImpactAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybouslim.positiveImpactAPI.model.Donor;
import com.ybouslim.positiveImpactAPI.repository.DonorRepository;

import lombok.Data;

@Data
@Service
public class DonorService {

	@Autowired
	private DonorRepository repository;
	
	
	public Optional<Donor> getDonor(final Long id) {
		return repository.findById(id);
	}
	
	
    public void deleteDonor(final Long id) {
        repository.deleteById(id);
    }

    public Donor saveDonor(Donor donor) {
        Donor savedDonor = repository.save(donor);
        return savedDonor;
    }
	
}
