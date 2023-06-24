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
import com.napa.app.entity.FeePK;


@Service
public class FeeService {
	
	@Autowired
	FeeDao feedao;
	@Autowired
	FeeRepository feerepository;
	
	public List<Fee> FeeGet(@PathVariable("Id") Integer id) {
		return feerepository.findByPrimarykeys(id);
	}
	

	
public void Feeadd(Fee fee) {

	feerepository.save(fee);
	
}

public void Feedel(Fee fee) {
	
	Integer id = fee.getId();
	Integer fee_seq = fee.getFee_seq();
	Date use_date = fee.getUse_date();
	
	
	feedao.Feedel(id,fee_seq,use_date);
	
}


}
