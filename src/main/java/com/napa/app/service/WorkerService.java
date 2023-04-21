package com.napa.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napa.app.dao.WorkerDao;
import com.napa.app.entity.Worker;

@Service
public class WorkerService {
	
	@Autowired
	WorkerDao workerdao;
	

	
public List<Worker> AllWorkerSelect(){
	return this.workerdao.AllWorker();
}
	

}
