package com.ybouslim.positiveImpactAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ybouslim.positiveImpactAPI.model.Donor;

@Repository
public interface DonorRepository extends CrudRepository<Donor,Long>{

}
