package com.napa.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.napa.app.entity.Fee;
import com.napa.app.entity.FeePK;
import com.napa.app.entity.Worker;

@Repository
public interface FeeRepository extends JpaRepository<Fee, Integer>{
	
	

}
