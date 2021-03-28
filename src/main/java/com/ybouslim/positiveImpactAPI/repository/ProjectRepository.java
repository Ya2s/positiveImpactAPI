package com.ybouslim.positiveImpactAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ybouslim.positiveImpactAPI.model.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long>{

}
