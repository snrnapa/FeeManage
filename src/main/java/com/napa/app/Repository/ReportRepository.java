package com.napa.app.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.napa.app.entity.Report;
import com.napa.app.entity.ReportPK;


@Repository
public interface ReportRepository extends JpaRepository<Report,ReportPK>{
	
	 @Query("select o from Report o where o.id = :id")
	    List<Report> findByPrimarykeys(@Param("id")int id);

	
	

}
