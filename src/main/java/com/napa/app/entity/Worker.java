package com.napa.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Worker {
//	workerテーブルより取得
	
	@Id
    private Integer id;
	private String first_name;
    private String last_name;
    private String dept;
    private String team;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
  
}
