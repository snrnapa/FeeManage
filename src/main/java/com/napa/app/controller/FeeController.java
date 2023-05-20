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
			@RequestParam("id") Integer id,
			Model model) {
		model.addAttribute("first_name", first_name);
		model.addAttribute("last_name", last_name);
		model.addAttribute("id", id);
//		Integer id = feeform.getId();
		List<Fee> feelist = feeservice.feeResult(id);
		Integer sum = feeservice.Feecalc(feelist);
		
			model.addAttribute("fee", feelist);
			model.addAttribute("sumfee", sum);
			
			return "feepage";

		}
	
//	POSTリレーをする場合
	@PostMapping("/feeadd")
	public String Feeadd(
//			POSTした値を扱えるようにする。
			@RequestParam("id") Integer id,
			@RequestParam("first_name") String first_name,
			@RequestParam("last_name") String last_name,
			@RequestParam("round_trip") String round_trip,
			@RequestParam("total_fee") Integer total_fee,
			@RequestParam("use_date") Date use_date,
			Model model) {
//		POSTした氏名をそのままビューへ
		model.addAttribute("first_name", first_name);
		model.addAttribute("last_name", last_name);
		model.addAttribute("id", id);
//		入力した値をDBへ登録する処理
		feeservice.Feeadd(id, round_trip,total_fee,use_date);
//		POSTBACKした際に、Feeが表示されるようにもう一度取得し直す。
		List<Fee> feelist = feeservice.feeResult(id);
		Integer sum = feeservice.Feecalc(feelist);
//		ビューへ返却する
		model.addAttribute("sumfee", sum);
		model.addAttribute("fee", feelist);
		return "feepage";
	}
	
	
//	POSTリレーをする場合
	@PostMapping("/feedel")
	public String Feedel(
			@RequestParam("id") Integer id,
			@RequestParam("use_date") Date use_date,
			@RequestParam("first_name") String first_name,
			@RequestParam("last_name") String last_name,
			Model model){
//		POSTした氏名をそのままビューへ
		model.addAttribute("first_name", first_name);
		model.addAttribute("last_name", last_name);
		model.addAttribute("id", id);
		feeservice.Feedel(id, use_date);
		return "feepage";
//		return "redirect:/fee";
	}
	

	
}
