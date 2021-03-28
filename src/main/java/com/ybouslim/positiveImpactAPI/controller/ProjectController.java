package com.ybouslim.positiveImpactAPI.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ybouslim.positiveImpactAPI.model.Project;
import com.ybouslim.positiveImpactAPI.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService service;
	
    @GetMapping("/projects")
    public Iterable<Project> getProjects() {
        return service.getProjects();
    }
    
    @GetMapping("/projects/{id}")
    public Optional<Project> getProject(@PathVariable("id") final Long id) {
    	return service.getProject(id);
    }
}
