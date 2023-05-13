package com.napa.app.controller;

import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.napa.app.entity.Fee;
import com.napa.app.entity.Worker;
import com.napa.app.form.FeeForm;
import com.napa.app.service.FeeService;

@Controller
public class FeeController {
	
	@Autowired
	FeeService feeservice;


	@RequestMapping("/fee")
	public String index(
			@RequestParam("first_name") String first_name,
			@RequestParam("last_name") String last_name,
			FeeForm feeform,
			Model model) {
		Integer sum = 0;
		model.addAttribute("first_name", first_name);
		model.addAttribute("last_name", last_name);
		
		

		if (feeform.getId() != null) {
			List<Fee> list = feeservice.feeResult(feeform.getId());
			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i).getTotal_fee();
			}

			model.addAttribute("fee", list);
			model.addAttribute("sumfee", sum);

		}
		return "mainpage";
	}
	
	
	
	


	
	@RequestMapping("/add")
	public String Feeadd(Fee fee) {

		feeservice.Feeadd(fee.getId(), fee.getRound_trip(), fee.getTotal_fee(),fee.getUse_date());
		return "mainpage";
	}
	
}
