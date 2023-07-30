package com.napa.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {

	// Projectテーブルより取得
	@Id
	private String projno;
	private String projectname;
	private String customerid;
	private Integer leaderid;

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

	public Integer getLeaderid() {
		return leaderid;
	}

	public void setLeaderid(Integer leaderid) {
		this.leaderid = leaderid;
	}

}
