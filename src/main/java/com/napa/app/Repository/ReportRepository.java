package com.napa.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.napa.app.entity.Report;
import com.napa.app.entity.Worker;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{
	
	

}
