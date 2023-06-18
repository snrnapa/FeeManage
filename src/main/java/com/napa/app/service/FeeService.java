package com.napa.app.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.napa.app.Repository.FeeRepository;
import com.napa.app.dao.FeeDao;
import com.napa.app.entity.Fee;


@Service
public class FeeService {
	
	@Autowired
//	FeeDao feedao;
	FeeRepository feerepository;
	
	public Optional<Fee> FeeGet(@PathVariable("Id") Integer id) {
		return feerepository.findById(id);
//		return this.feedao.feeResult(id);
	}
	

	
public void Feeadd(Fee fee) {
//	fee.setId(id);
//	fee.setRound_trip(round_trip);
//	fee.setTotal_fee(total_fee);
//	fee.setUse_date(use_date);
	feerepository.save(fee);
	
//	feedao.Feeadd(fee);
	
}

public void Feedel(Integer id , Date use_date) {
	feedao.Feedel(id,use_date);
	
}


}
