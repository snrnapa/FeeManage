package com.napa.app.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class FeePK{
	@Embedded
	private Integer id;
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
	private Integer fee_seq;
	
}
