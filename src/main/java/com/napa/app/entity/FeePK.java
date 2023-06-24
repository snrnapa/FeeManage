package com.napa.app.entity;

import java.sql.Date;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class FeePK{
	@Embedded
	private Integer id;
	
	private Integer fee_seq;
	
	private Date use_date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFee_seq() {
		return fee_seq;
	}
	public void setFee_seq(Integer fee_seq) {
		this.fee_seq = fee_seq;
	}
	public Date getUse_date() {
		return use_date;
	}
	public void setUse_date(Date use_date) {
		this.use_date = use_date;
	}

	
}
