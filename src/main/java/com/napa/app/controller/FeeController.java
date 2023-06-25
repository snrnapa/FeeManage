package com.napa.app.controller;
	
import java.util.List;
import java.util.Optional;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.napa.app.entity.Fee;
import com.napa.app.entity.FeePK;
import com.napa.app.entity.Worker;
import com.napa.app.service.FeeService;
import com.napa.app.service.WorkerService;

@Controller
@CrossOrigin(origins = "*")
public class FeeController {
	
	@Autowired
	FeeService feeservice;
	@Autowired
	WorkerService workerservice;
	
//	従業員のFeeを取得する場合
	@GetMapping("/fee")
	@ResponseBody
	public List<Fee> FeeGet(
			@RequestParam("id") Integer id) {
//		Reactでは、Fee以外の取得は不要。（React側で、workerを取り直すということは実装する予定である）
//		Object[] array = new Object[2];
//		array[0] = workerservice.OneWorkerSelect(id);
		List<Fee> feelist = feeservice.FeeGet(id);

		return feelist;
	

		}
	
	@PostMapping("/fee")
	@ResponseBody
	public Object[] Feeadd(@RequestBody Fee fee){
//		入力した値をDBへ登録する処理
		feeservice.Feeadd(fee);
		Object[] array = new Object[2];
		Integer id = fee.getId();
//		Workerと、Feeをリロードする。
		array[0] = feeservice.FeeGet(id);
		array[1] = workerservice.OneWorkerSelect(id);
		
		return array;
	}
	
	

	@PostMapping("/fee/del")
	@ResponseBody
	public Object[]Feedel(@RequestBody Fee fee){
		
		
		feeservice.Feedel(fee);
		
		Object[] array = new Object[2];
		Integer id = fee.getId();
//		Workerと、Feeをリロードする。
		array[0] = feeservice.FeeGet(id);
		array[1] = workerservice.OneWorkerSelect(id);
		
		return array;
	}
	

	
}
