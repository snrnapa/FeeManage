package com.napa.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.napa.app.Repository.EffortRepository;
import com.napa.app.entity.Customer;
import com.napa.app.entity.Effort;
import com.napa.app.entity.Worker;

import com.napa.app.entity.EffortProjectDto;
import com.napa.app.entity.Project;

@Service
public class EffortService {

	@Autowired
	private EffortRepository effortrepository;

	@Autowired
	ProjectService projectservice;

	@Autowired
	CustomerService customerservice;

	@Autowired
	WorkerService workerservice;

	public List<EffortProjectDto> AllEffortSelect(@PathVariable("Id") Integer id) {

		List<Effort> effort = effortrepository.findByPrimarykeys(id);
		ArrayList<EffortProjectDto> epdlist = new ArrayList<EffortProjectDto>();

		Worker worker = workerservice.OneWorkerSelect(id);

		for (int i = 0; i < effort.size(); i++) {

			Effort targeteffort = effort.get(i);
			String targetprojno = targeteffort.getProjno();

			Project project = projectservice.AllProjectSelect(targetprojno);

			String targetcustomerid = project.getCustomerid();
			Customer customer = customerservice.AllCustomerSelect(targetcustomerid);

			EffortProjectDto epd = new EffortProjectDto();

			epd.setId(worker.getId());
			epd.setAtdate(targeteffort.getAtdate());
			epd.setProjno(project.getProjno());
			epd.setProjectname(project.getProjectname());
			epd.setCustomerid(customer.getCustomerid());
			epd.setCustomername(customer.getCustomername());
			epd.setLeaderid(project.getLeaderid());
			epd.setAtdate(targeteffort.getAtdate());
			epd.setLeaderid(project.getLeaderid());
			epd.setLeadername(worker.getLast_name() + " " + worker.getFirst_name());
			epd.setWorkstart(targeteffort.getWorkstart());
			epd.setWorkend(targeteffort.getWorkend());

			epdlist.add(epd);
		}

		return epdlist;
	}

}
