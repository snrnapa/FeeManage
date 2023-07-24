package com.napa.app.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.napa.app.Repository.EffortRepository;
import com.napa.app.entity.Effort;
import com.napa.app.entity.Report;

@Service
public class EffortService {
	
	@Autowired
	private EffortRepository effortrepository;



	public List<Effort> AllEffortSelect(@PathVariable("Id") Integer id){
		return effortrepository.findByPrimarykeys(id);
	}
	
	

	
	


}
