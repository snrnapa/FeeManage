package com.napa.app.service;

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
		Fee fee = new Fee();
		fee.setId(id);
		return this.feedao.feeResult(fee);

	}
	
public List<Fee> AllFee(){
	return this.feedao.AllFeeResult();
}

public void FeeAdd(Integer id , Integer round_trip , int total_fee , String use_date) {
	Fee fee = new Fee();
	fee.setId(id);
	fee.setRound_trip(round_trip);
	fee.setTotal_fee(total_fee);
	fee.setUse_date(use_date);
	feedao.add(fee);
}


	

}
