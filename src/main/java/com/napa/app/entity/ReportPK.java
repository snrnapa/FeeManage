package com.napa.app.entity;

import java.sql.Date;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class ReportPK{
	@Embedded
	private Integer id;
	
	private Date atdate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getAtdate() {
		return atdate;
	}
	public void setAtdate(Date atdate) {
		this.atdate =atdate;
	}

	
}
