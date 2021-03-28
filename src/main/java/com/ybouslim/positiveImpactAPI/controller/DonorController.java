package com.ybouslim.positiveImpactAPI.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ybouslim.positiveImpactAPI.model.Donor;
import com.ybouslim.positiveImpactAPI.service.DonorService;

@RestController
public class DonorController {
	
	@Autowired
	private DonorService service;
	
	
    @GetMapping("/donors/{id}")
    public Optional<Donor> getDonor(@PathVariable("id") final Long id) {
        return service.getDonor(id);
    }
}
