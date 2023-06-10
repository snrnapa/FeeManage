package com.napa.app.entity;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Worker {
//	workerテーブルより取得
	

    private Integer id;
	private String first_name;
    private String last_name;
    private String dept;
    private String team;
  
}
