package com.napa.app.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.napa.app.entity.Fee;
@Mapper
public interface FeeDao {
	
	List<Fee> feeResult(Fee fee);
	
	List<Fee> AllFeeResult();
	
	void Feeadd(Fee fee);

}
