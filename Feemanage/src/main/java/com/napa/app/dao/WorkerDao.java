package com.napa.app.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.napa.app.entity.Worker;
@Mapper
public interface WorkerDao {
	

	List<Worker> AllWorker();

}
