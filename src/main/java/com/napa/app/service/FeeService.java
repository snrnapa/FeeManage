package com.napa.app.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napa.app.dao.FeeDao;
import com.napa.app.entity.Fee;


@Service
public class FeeService {
	
	@Autowired
	FeeDao feedao;
	
	public List<Fee> feeResult(Integer id) {
		return this.feedao.feeResult(id);
	}
	
	public Integer Feecalc(List<Fee> feelist) {
			Integer sum = 0;
			for (int i = 0; i < feelist.size(); i++) {
				sum += feelist.get(i).getTotal_fee();
			}
			return sum;
	}
	


public void Feeadd(Integer id , String round_trip , int total_fee , Date use_date) {
	Fee fee = new Fee();
	fee.setId(id);
	fee.setRound_trip(round_trip);
	fee.setTotal_fee(total_fee);
	fee.setUse_date(use_date);
	feedao.Feeadd(fee);
	
}

public void Feedel(Integer id , Date use_date) {
	feedao.Feedel(id,use_date);
	
}


}
