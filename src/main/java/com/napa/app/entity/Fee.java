package com.napa.app.entity;

import lombok.Data;

@Data
public class Fee {
//	feeテーブルより取得
    private Integer id;
    private Integer round_trip;
    private int total_fee;
    private String use_date;


    
    
}
