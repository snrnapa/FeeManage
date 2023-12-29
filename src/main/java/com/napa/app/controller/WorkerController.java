package com.napa.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.napa.app.entity.M_Worker;
import com.napa.app.service.WorkerService;

@RestController
// @Controller
@CrossOrigin(origins = "*")
public class WorkerController {

	@Autowired
	WorkerService workerservice;

	@GetMapping("/")
	@ResponseBody
	public List<M_Worker> getWorkers() {
		List<M_Worker> worker = workerservice.AllWorkerSelect();

		return worker;

	}

	// Workerのinsertを行う
	@PostMapping("/")
	@ResponseBody
	public List<M_Worker> AddWorker(@RequestBody M_Worker worker) {
		workerservice.AddWorker(worker);
		List<M_Worker> workers = workerservice.AllWorkerSelect();
		return workers;

	}

	@PostMapping("/delworker")
	@ResponseBody
	public List<M_Worker> Deleteworker(@RequestBody M_Worker worker) {
		workerservice.Deleteworker(worker.getId());
		List<M_Worker> workers = workerservice.AllWorkerSelect();
		return workers;
	}

}
