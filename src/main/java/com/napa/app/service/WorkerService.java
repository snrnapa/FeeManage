package com.napa.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.napa.app.Repository.WorkerRepository;
import com.napa.app.dao.WorkerDao;
import com.napa.app.entity.Worker;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerrepository;
//	WorkerDao workerdao;

	

	////JPA使用前
	//public List<Worker> AllWorkerSelect(){
	//	return this.workerdao.AllWorker();
	//}
	
//JPA使用バージョン
public List<Worker> AllWorkerSelect(){
	return workerrepository.findAll();
}


	////JPA未使用タイプ
	//public Worker OneWorkerSelect(Integer id){
	//	return this.workerdao.OneWorker(id);
	//}

//JPA使用タイプ
public Optional<Worker> OneWorkerSelect(@PathVariable("id") Integer id){
	return workerrepository.findById(id);
//	return this.workerdao.OneWorker(id);
}


public void AddWorker(Integer id,String first_name,String last_name,String dept,String team){
	Worker worker = new Worker();
	worker.setId(id);
	worker.setFirst_name(first_name);
	worker.setLast_name(last_name);
	worker.setDept(dept);
	worker.setTeam(team);
	workerrepository.save(worker);
//	workerdao.WorkerAdd(worker);
}

public void Deleteworker(Integer id){
	Worker worker = new Worker();
	worker.setId(id);
	workerdao.Deleteworker(worker);
}


}
