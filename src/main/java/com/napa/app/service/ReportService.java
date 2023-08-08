package com.napa.app.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.napa.app.Repository.ReportRepository;
import com.napa.app.entity.Report;

@Service
public class ReportService {

	@Autowired
	private ReportRepository reportrepository;

	public List<Report> AllReportSelect(@PathVariable("Id") Integer id) {
		return reportrepository.findByPrimarykeys(id);
	}

	public void ReportUpdate(Report targetreport) {

		reportrepository.save(targetreport);

	}

}
