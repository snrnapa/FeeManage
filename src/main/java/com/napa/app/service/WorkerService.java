package com.napa.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napa.app.Repository.WorkerRepository;
import com.napa.app.dao.WorkerDao;
import com.napa.app.entity.Worker;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository repository;
//	WorkerDao workerdao;

	

	
//public List<Worker> AllWorkerSelect(){
//	return this.workerdao.AllWorker();
//}


public List<Worker> AllWorkerSelect(){
	return repository.findAll();
}



public Worker OneWorkerSelect(Integer id){
	return this.workerdao.OneWorker(id);
}


public void AddWorker(Integer id,String first_name,String last_name,String dept,String team){
	Worker worker = new Worker();
	worker.setId(id);
	worker.setFirst_name(first_name);
	worker.setLast_name(last_name);
	worker.setDept(dept);
	worker.setTeam(team);
	workerdao.WorkerAdd(worker);
}

public void Deleteworker(Integer id){
	Worker worker = new Worker();
	worker.setId(id);
	workerdao.Deleteworker(worker);
}


}
