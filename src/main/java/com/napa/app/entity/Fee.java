package com.napa.app.entity;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Fee {
//	feeテーブルより取得
    private Integer id;
    private String round_trip;
	private int total_fee;
    private Date use_date;  

}
