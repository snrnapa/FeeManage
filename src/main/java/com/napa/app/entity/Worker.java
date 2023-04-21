package com.napa.app.entity;

import lombok.Data;

@Data
public class Worker {
//	workerテーブルより取得
    private Integer id;
    private String first_name;
    private String last_name;
}
