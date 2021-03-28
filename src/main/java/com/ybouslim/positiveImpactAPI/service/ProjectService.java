package com.ybouslim.positiveImpactAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybouslim.positiveImpactAPI.model.Project;
import com.ybouslim.positiveImpactAPI.repository.ProjectRepository;

import lombok.Data;

@Data
@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository repository;
	
	public Optional<Project> getProject(final Long id) {
		return repository.findById(id);
	}

	public Iterable<Project> getProjects() {
		Iterable <Project> projects = repository.findAll();
		return projects;
	}
	
}
