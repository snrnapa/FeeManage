package com.napa.app.controller;

import java.util.ArrayList;
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

	@GetMapping("/effort")
	@ResponseBody
	public List<EffortProjectDto> getEffort(
			@RequestParam("id") Integer id) {

		// ArrayList<EffortProjectDto> epdlist = new ArrayList<EffortProjectDto>();
		// List<Effort> effort = effortservice.AllEffortSelect(id);

		// for (int i = 0; i < effort.size(); i++) {

		// Effort targeteffort = effort.get(i);
		// String targetprojno = targeteffort.getProjno();

		// Project project = projectservice.AllProjectSelect(targetprojno);

		// String targetcustomerid = project.getCustomerid();
		// Customer customer = customerservice.AllCustomerSelect(targetcustomerid);

		// EffortProjectDto epd = new EffortProjectDto();

		// epd.setAtdate(targeteffort.getAtdate());
		// epd.setProjectname(project.getProjectname());
		// epd.setCustomerid(customer.getCustomerid());
		// epd.setCustomername(customer.getCustomername());
		// epd.setLeaderid(project.getLeaderid());
		// epd.setAtdate(targeteffort.getAtdate());
		// epd.setWorkstart(effort.getWorkstart());
		// epd.setLeaderid(project.getLeaderid());

		// epd.setLeadername(project.getLeadername());

		// }

		List<EffortProjectDto> epdlistresult = effortservice.AllEffortSelect(id);

		return epdlistresult;

	}

}
