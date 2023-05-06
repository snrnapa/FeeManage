package com.napa.app.entity;

public class Fee {
//	feeテーブルより取得
    private Integer id;
    private String round_trip;
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
	public String getUse_date() {
		return use_date;
	}
	public void setUse_date(String use_date) {
		this.use_date = use_date;
	}
	private int total_fee;
    private String use_date;  
}
