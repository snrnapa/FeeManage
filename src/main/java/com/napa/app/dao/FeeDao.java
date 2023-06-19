package com.napa.app.dao;
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.napa.app.entity.Fee;
@Mapper
public interface FeeDao {
	
	void Feedel(Integer id , Integer fee_seq, Date use_date);

}
