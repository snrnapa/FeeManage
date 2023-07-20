package com.napa.app.entity;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Report {
//	feeテーブルより取得
	@Id
    private Integer id;
	private String location;
	private Date atdate;
    private Time workstart;
    private Time workend;
    private Time reststart;
    private Time restend;
}
    
    