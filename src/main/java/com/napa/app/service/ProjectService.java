package com.napa.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.napa.app.Repository.ProjectRepository;
import com.napa.app.entity.Project;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectrepository;

	public Project AllProjectSelect(@PathVariable("projno") String projno) {
		return projectrepository.findByPrimarykeys(projno);
	}

}
