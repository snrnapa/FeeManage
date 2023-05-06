package com.napa.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.napa.app.entity.Fee;
import com.napa.app.form.FeeForm;
import com.napa.app.service.FeeService;

@Controller
@RequestMapping("/workerlist")
public class FeeController {

	Integer sum = 0;

	@Autowired
	FeeService feeservice;

	@RequestMapping("/result")
	public String index(
			@RequestParam String first_name,
			@RequestParam String last_name,
			FeeForm feeform,
			String showList,
			Model model) {
		sum = 0;
		model.addAttribute("first", first_name);
		model.addAttribute("last", last_name);

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
	public String add(Fee fee) {
		feeservice.FeeAdd(fee.getId(), fee.getRound_trip(), fee.getTotal_fee(),fee.getUse_date());
		return "redirect:/";
	}
	
	
	
}
