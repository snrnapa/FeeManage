package com.napa.app.controller;
	
import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.napa.app.entity.Fee;
import com.napa.app.entity.Worker;
import com.napa.app.entity.Man_hours;
import com.napa.app.service.FeeService;
import com.napa.app.service.Man_hoursService;
import com.napa.app.service.WorkerService;

@Controller
public class Man_hoursContoroller {
	
	@Autowired
	Man_hoursService mhservice ;
	@Autowired
	WorkerService workerservice;
	
//	従業員のFeeを取得する場合
	@GetMapping("/man_hours")
	public String index(
			@RequestParam("id") Integer id,
			Model model) {
		
		Worker oneworker = workerservice.OneWorkerSelect(id);
		List<Man_hours> mhlist = mhservice.Man_hoursGet(id);
	
		
			model.addAttribute("man_hours", mhlist);
			model.addAttribute("oneworker", oneworker);
				return "man-hours";
		}
	
		/*
		 * @PostMapping("/fee") public String Feeadd( // POSTした値を扱えるようにする。
		 * 
		 * @RequestParam("id") Integer id,
		 * 
		 * @RequestParam("round_trip") String round_trip,
		 * 
		 * @RequestParam("total_fee") Integer total_fee,
		 * 
		 * @RequestParam("use_date") Date use_date, Model model) { // 入力した値をDBへ登録する処理
		 * feeservice.Feeadd(id, round_trip,total_fee,use_date);
		 * 
		 * // Workerと、Feeをリロードする。 List<Fee> feelist = feeservice.FeeGet(id); Worker
		 * oneworker = workerservice.OneWorkerSelect(id); Integer sum =
		 * feeservice.Feecalc(feelist);
		 * 
		 * model.addAttribute("oneworker", oneworker); model.addAttribute("sumfee",
		 * sum); model.addAttribute("fee", feelist); return "feepage"; }
		 * 
		 * 
		 * // RESTAPIの場合 // @DeleteMapping("/fee")
		 * 
		 * // WEBアプリの場合
		 * 
		 * @PostMapping("/feedel") public String Feedel(
		 * 
		 * @RequestParam("id") Integer id,
		 * 
		 * @RequestParam("use_date") Date use_date, Model model){
		 * 
		 * 
		 * feeservice.Feedel(id, use_date);
		 * 
		 * // Workerと、Feeをリロードする。 List<Fee> feelist = feeservice.FeeGet(id); Worker
		 * oneworker = workerservice.OneWorkerSelect(id); Integer sum =
		 * feeservice.Feecalc(feelist);
		 * 
		 * 
		 * model.addAttribute("oneworker", oneworker); model.addAttribute("sumfee",
		 * sum); model.addAttribute("fee", feelist);
		 * 
		 * return "feepage"; }
		 */
	

	
}
