package com.napa.app.service;

import java.sql.Date;
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

public void Feeadd(Integer id , String round_trip , int total_fee , Date use_date) {
	Fee fee = new Fee();
	fee.setId(id);
	fee.setRound_trip(round_trip);
	fee.setTotal_fee(total_fee);
	fee.setUse_date(use_date);
	fee.setTotal_fee(total_fee);
	fee.setUse_date(use_date);
	

	feedao.Feeadd(fee);
	
}

}
