package com.napa.app.entity;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;


@IdClass(EffortPK.class)
@Entity
public class Effort {
	
	//	feeテーブルより取得
	@Id
    private Integer id;
	@Id
	private Date atdate;
	@Id
	private Integer seq;
    private String projno;
    private Time workstart;
    private Time workend;
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
		this.atdate = atdate;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getProjno() {
		return projno;
	}
	public void setProjno(String projno) {
		this.projno = projno;
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
    
    