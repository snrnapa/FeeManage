package com.napa.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.napa.app.entity.Customer;
import com.napa.app.entity.Effort;
import com.napa.app.entity.Project;

import com.napa.app.entity.EffortProjectDto;
import com.napa.app.service.EffortService;
import com.napa.app.service.ProjectService;
import com.napa.app.service.CustomerService;

@RestController
// @Controller
@CrossOrigin(origins = "*")
public class EffortController {

	@Autowired
	EffortService effortservice;

	@Autowired
	ProjectService projectservice;

	@Autowired
	CustomerService customerservice;

	@GetMapping("/effort")
	@ResponseBody
	public EffortProjectDto getEffort(
			@RequestParam("id") Integer id) {

		Effort effort = effortservice.AllEffortSelect(id);
		String targetprojno = effort.getProjno();
		Project project = projectservice.AllProjectSelect(targetprojno);
		String targetcustomerid = project.getCustomerid();
		Customer customer = customerservice.AllCustomerSelect(targetcustomerid);

		EffortProjectDto epd = new EffortProjectDto(effort, project, customer);

		return epd;

	}

}
