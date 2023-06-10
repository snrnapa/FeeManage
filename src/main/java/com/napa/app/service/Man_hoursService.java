package com.napa.app.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napa.app.dao.FeeDao;
import com.napa.app.dao.Man_hoursDao;
import com.napa.app.entity.Fee;
import com.napa.app.entity.Man_hours;


@Service
public class Man_hoursService {
	
	@Autowired
	Man_hoursDao mhdao;
	
	public List<Man_hours> Man_hoursGet(Integer id) {
		return this.mhdao.Man_hoursGet(id);
	}
	
//
//public void Feeadd(Integer id , String round_trip , int total_fee , Date use_date) {
//	Fee fee = new Fee();
//	fee.setId(id);
//	fee.setRound_trip(round_trip);
//	fee.setTotal_fee(total_fee);
//	fee.setUse_date(use_date);
//	feedao.Feeadd(fee);
//	
//}
//
//public void Feedel(Integer id , Date use_date) {
//	feedao.Feedel(id,use_date);
//	
//}


}
