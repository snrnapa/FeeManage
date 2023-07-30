package com.napa.app.entity;

import java.sql.Date;
import java.sql.Time;

public class EffortProjectDto {
	private Integer id;

	private String projno;
	private String projectname;
	private String customerid;
	private String customername;
	private Integer leaderid;
	private String leadername;
	private Integer seq;
	private Date atdate;
	private Time workstart;
	private Time workend;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjno() {
		return projno;
	}

	public void setProjno(String projno) {
		this.projno = projno;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Integer getLeaderid() {
		return leaderid;
	}

	public void setLeaderid(Integer leaderid) {
		this.leaderid = leaderid;
	}

	public String getLeadername() {
		return leadername;
	}

	public void setLeadername(String leadername) {
		this.leadername = leadername;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Date getAtdate() {
		return atdate;
	}

	public void setAtdate(Date atdate) {
		this.atdate = atdate;
	}

	public Time getWorkstart() {
		return workstart;
	}

	public void setWorkstart(Time workstart) {
		this.workstart = workstart;
	}

	public Time getWorkend() {
		return workend;
	}

	public void setWorkend(Time workend) {
		this.workend = workend;
	}

}
