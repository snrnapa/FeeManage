package com.napa.app.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.napa.app.Repository.ReportRepository;
import com.napa.app.entity.Report;

@Service
public class ReportService {
	
	@Autowired
	private ReportRepository reportrepository;



	public Optional<Report> AllReportSelect(@PathVariable("Id") Integer id){
		return reportrepository.findById(id);
	}
	
	

	
	


}