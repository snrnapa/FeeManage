package com.napa.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.napa.app.entity.Report;
import com.napa.app.service.ReportService;

@RestController
//@Controller
@CrossOrigin(origins = "*")
public class ReportController{

	@Autowired
	ReportService reportservice;

	@GetMapping("/report")
	@ResponseBody
	public List<Report> getReport(
			@RequestParam("id") Integer id) {
		List<Report> report = reportservice.AllReportSelect(id);

		return report;

	}


}

