package com.napa.app.controller;

import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
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
		model.addAttribute("first_name", first_name);
		model.addAttribute("last_name", last_name);
		Integer id = feeform.getId();
		List<Fee> feelist = feeservice.feeResult(id);
		Integer sum = feeservice.Feecalc(feelist);
		
			model.addAttribute("fee", feelist);
			model.addAttribute("sumfee", sum);
			
			return "feepage";

		}
	
	
//	POSTリレーをする場合
	@PostMapping("/feeadd")
	public String Feeadd(
			FeeForm feeform,
			@RequestParam("first_name") String first_name,
			@RequestParam("last_name") String last_name,
			@RequestParam("round_trip") String round_trip,
			@RequestParam("total_fee") Integer total_fee,
			@RequestParam("use_date") Date use_date,
			Model model) {
//		POSTした氏名をそのままビューへ
		model.addAttribute("first_name", first_name);
		model.addAttribute("last_name", last_name);
		
		Integer id = feeform.getId();



		feeservice.Feeadd(id, round_trip,total_fee,use_date);
		List<Fee> feelist = feeservice.feeResult(id);
		Integer sum = feeservice.Feecalc(feelist);
		model.addAttribute("sumfee", sum);
		model.addAttribute("fee", feelist);
		return "feepage";
	}
	

	
}
