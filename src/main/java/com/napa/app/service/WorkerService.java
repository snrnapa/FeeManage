package com.napa.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.napa.app.Repository.WorkerRepository;
import com.napa.app.entity.Worker;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerrepository;



	public List<Worker> AllWorkerSelect(){
		return workerrepository.findAll();
	}
	
	
	public Optional<Worker> OneWorkerSelect(@PathVariable("id") Integer id){
		return workerrepository.findById(id);
	}
	
	
	public void AddWorker(Worker worker){

		workerrepository.save(worker);
	}
	
	public void Deleteworker(@PathVariable("id") Integer id){
	
		workerrepository.deleteById(id);
	}

}
