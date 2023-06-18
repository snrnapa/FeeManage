package com.napa.app.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Fee {
//	feeテーブルより取得
	@Id
    private Integer id;
    private String round_trip;
	private int total_fee;
    private Date use_date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRound_trip() {
		return round_trip;
	}
	public void setRound_trip(String round_trip) {
		this.round_trip = round_trip;
	}
	public int getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(int total_fee) {
		this.total_fee = total_fee;
	}
	public Date getUse_date() {
		return use_date;
	}
	public void setUse_date(Date use_date) {
		this.use_date = use_date;
	}  

}
