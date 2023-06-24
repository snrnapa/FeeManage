package com.napa.app.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.napa.app.entity.Fee;
import com.napa.app.entity.FeePK;


@Repository
public interface FeeRepository extends JpaRepository<Fee, FeePK>{
	 @Query("select o from Fee o where o.id = :id")
    List<Fee> findByPrimarykeys(@Param("id")int id);
	

}
