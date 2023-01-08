package com.napa.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String index(FeeForm feeform, String showList, Model model) {
	
	model.addAttribute("title", "Vinci_workerlist");

	

//    if(feeform.getId() != null) {
//        Fee fee = feeservice.feeResult(feeform.getId());
//        model.addAttribute("fee", fee);
//    }
	
	
	
	  if(feeform.getId() != null) {
		  List<Fee> list = feeservice.feeResult(feeform.getId());
	      model.addAttribute("fee", list);
	      
	  }
	
	return "index";

    }
}
