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


	@PostMapping("/")
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
	
	
////	POSTリレーをする場合
//	@PostMapping("/feeadd")
//	public String Feeadd(
//			Fee fee,
//			@RequestParam("first_name") String first_name,
//			@RequestParam("last_name") String last_name,
//			Model model) {
//		model.addAttribute("first_name", first_name);
//		model.addAttribute("last_name", last_name);
//
//
//		feeservice.Feeadd(fee.getId(), fee.getRound_trip(), fee.getTotal_fee(),fee.getUse_date());
//		return "feepage";
//	}
	
//　POSTはID飲みにしてすべてDBで取得
	@PostMapping("/feeadd")
	public String Feeadd(
			Fee fee,
			Model model) {


		feeservice.Feeadd(fee.getId(), fee.getRound_trip(), fee.getTotal_fee(),fee.getUse_date());
		return "feepage";
	}
	
}
