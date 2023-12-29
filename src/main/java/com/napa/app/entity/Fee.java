package com.napa.app.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass(FeePK.class)
@Table(name = "t_fee")
public class Fee {
	@Id
	private Integer id;
	@Id
	private Integer fee_seq;

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

	public String getRound_trip() {
		return round_trip;
	}

	public void setRound_trip(String round_trip) {
		this.round_trip = round_trip;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public Date getUse_date() {
		return use_date;
	}

	public void setUse_date(Date use_date) {
		this.use_date = use_date;
	}

	private String round_trip;
	private int fee;
	@Id
	private Date use_date;

}
