package com.napa.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.napa.app.entity.Worker;
import com.napa.app.service.WorkerService;

@Controller
public class WorkerController {

	@Autowired
	WorkerService workerservice;

	@RequestMapping("/")
	public String main(Model model) {

		List<Worker> list = workerservice.AllWorkerSelect();
		model.addAttribute("Worker", list);
		return "workerpage";

	}
		@RequestMapping("/addworker")
			public String WorkerAdd(Worker worker) {
				workerservice.AddWorker(worker.getId(),worker.getFirst_name(),worker.getLast_name(),worker.getDept(),worker.getTeam());
				return "redirect:/";
			}
		
		@RequestMapping("/delworker")
		public String Deleteworker(Worker worker) {
			workerservice.Deleteworker(worker.getId());
			return "redirect:/";
		}
		
			
}

