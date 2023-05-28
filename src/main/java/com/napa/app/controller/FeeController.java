package com.napa.app.controller;
	
import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.napa.app.dao.WorkerDao;
import com.napa.app.entity.Fee;
import com.napa.app.entity.Worker;
import com.napa.app.form.FeeForm;
import com.napa.app.service.FeeService;
import com.napa.app.service.WorkerService;

@Controller
public class FeeController {
	
	@Autowired
	FeeService feeservice;
	@Autowired
	WorkerService workerservice;
	
//	従業員のFeeを取得する場合
	@GetMapping("/fee")
	public String index(
			@RequestParam("id") Integer id,
			Model model) {
		
		Worker oneworker = workerservice.OneWorkerSelect(id);
		List<Fee> feelist = feeservice.FeeGet(id);
	
		Integer sum = feeservice.Feecalc(feelist);
		
			model.addAttribute("fee", feelist);
			model.addAttribute("sumfee", sum);
			model.addAttribute("oneworker", oneworker);
			
				return "feepage";

		}
	
	@PostMapping("/feeadd")
	public String Feeadd(
//			POSTした値を扱えるようにする。
			@RequestParam("id") Integer id,
			@RequestParam("round_trip") String round_trip,
			@RequestParam("total_fee") Integer total_fee,
			@RequestParam("use_date") Date use_date,
			Model model) {
//		入力した値をDBへ登録する処理
		feeservice.Feeadd(id, round_trip,total_fee,use_date);
		
//		Workerと、Feeをリロードする。
		List<Fee> feelist = feeservice.FeeGet(id);
		Worker oneworker = workerservice.OneWorkerSelect(id);
		Integer sum = feeservice.Feecalc(feelist);
		
		model.addAttribute("oneworker", oneworker);
		model.addAttribute("sumfee", sum);
		model.addAttribute("fee", feelist);
		return "feepage";
	}
	
	
//	POSTリレーをする場合
	@PostMapping("/feedel")
	public String Feedel(
			@RequestParam("id") Integer id,
			@RequestParam("use_date") Date use_date,
			Model model){
		
//		Workerと、Feeをリロードする。
		List<Fee> feelist = feeservice.FeeGet(id);
		Worker oneworker = workerservice.OneWorkerSelect(id);
		Integer sum = feeservice.Feecalc(feelist);
		
		
		model.addAttribute("oneworker", oneworker);
		model.addAttribute("sumfee", sum);
		model.addAttribute("fee", feelist);
	
		return "feepage";
	}
	

	
}
