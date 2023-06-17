package com.napa.app.dao;
import org.apache.ibatis.annotations.Mapper;

import com.napa.app.entity.Worker;
@Mapper
public interface WorkerDao {
	

	Worker AllWorker();
	void WorkerAdd(Worker worker);
	void Deleteworker(Worker worker);
	Worker OneWorker(Integer id);

}
