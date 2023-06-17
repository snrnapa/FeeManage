package com.napa.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.napa.app.entity.Worker;
import com.napa.app.service.WorkerService;

@RestController
//@Controller
@CrossOrigin(origins = "*")
public class WorkerController {

	@Autowired
	WorkerService workerservice;

	@GetMapping("/")
//	@ResponseBody
	public Worker getWorkers() {
		Worker worker = workerservice.AllWorkerSelect();
		return worker;
		
//		Worker workers = workerservice.AllWorkerSelect();
//		return workers;


	}
//		@RequestMapping("/addworker")
//			public String WorkerAdd(Worker worker) {
//				workerservice.AddWorker(worker.getId(),worker.getFirst_name(),worker.getLast_name(),worker.getDept(),worker.getTeam());
//				return "redirect:/";
//			}
//		
//		@RequestMapping("/delworker")
//		public String Deleteworker(Worker worker) {
//			workerservice.Deleteworker(worker.getId());
//			return "redirect:/";
//		}
//		
			
}

