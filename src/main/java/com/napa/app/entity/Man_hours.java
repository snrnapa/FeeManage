package com.napa.app.entity;

import java.sql.Date;
import java.sql.Time;

import lombok.Data;


@Data
public class Man_hours {
//	feeテーブルより取得
    private Integer id;
    private Date ope_dete;
	private Time start_time;
    private Time end_time;
    private Integer project_no;
}
    
    