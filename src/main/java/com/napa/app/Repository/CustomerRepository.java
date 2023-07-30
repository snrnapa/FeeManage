package com.napa.app.Repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.napa.app.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

	Customer findByCustomerid(String customerid);

}
