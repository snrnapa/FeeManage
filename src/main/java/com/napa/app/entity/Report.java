package com.napa.app.entity;

import java.sql.Date;
import java.sql.Time;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Report {
//	feeテーブルより取得
    private Integer id;
    private Date ope_dete;
	private Time start_time;
    private Time end_time;
    private Integer project_no;
}
    
    