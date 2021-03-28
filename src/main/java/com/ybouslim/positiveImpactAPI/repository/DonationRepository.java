package com.ybouslim.positiveImpactAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ybouslim.positiveImpactAPI.model.DonorProject;
import com.ybouslim.positiveImpactAPI.model.Donor;

@Repository
public interface DonationRepository extends CrudRepository<DonorProject,Long>{

	Iterable<DonorProject> findByDonor(Donor donor); //https://stackoverflow.com/questions/52144019/find-all-records-in-a-table-based-on-other-field-than-id-in-springboot-using-jpa/52144064
	
}
