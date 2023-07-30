package com.napa.app.entity;

import java.sql.Date;
import java.sql.Time;

public class EffortProjectDto {
	private String projno;
	private String projectname;
	private String customerid;
	private String customername;
	private Integer leaderid;
	// private String leadername;
	private Integer seq;
	private Date atdate;
	private Time workstart;
	private Time workend;

	public EffortProjectDto(Effort effort, Project project, Customer customer) {

		this.projno = effort.getProjno();
		this.projectname = project.getProjectname();
		this.customerid = project.getCustomerid();
		this.customername = customer.getCustomername();
		this.leaderid = project.getLeaderid();
		// this.leadername = leadername;
		this.atdate = effort.getAtdate();
		this.workstart = effort.getWorkstart();
		this.workend = effort.getWorkend();

	}

}
