package com.napa.app.entity;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;


@IdClass(ReportPK.class)
@Entity
public class Report {
	
	//	feeテーブルより取得
	@Id
    private Integer id;
	@Id
	private Date atdate;
	private String location;
    private Time workstart;
    private Time workend;
    private Time reststart;
    private Time restend;
	
	
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public Time getReststart() {
		return reststart;
	}
	public void setReststart(Time reststart) {
		this.reststart = reststart;
	}
	public Time getRestend() {
		return restend;
	}
	public void setRestend(Time restend) {
		this.restend = restend;
	}

}
    
    