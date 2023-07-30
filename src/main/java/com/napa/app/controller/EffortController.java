package com.napa.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.napa.app.entity.EffortProjectDto;
import com.napa.app.service.EffortService;

@RestController
// @Controller
@CrossOrigin(origins = "*")
public class EffortController {

	@Autowired
	EffortService effortservice;

	@GetMapping("/effort")
	@ResponseBody
	public List<EffortProjectDto> getEffort(
			@RequestParam("id") Integer id) {

		List<EffortProjectDto> epdlistresult = effortservice.AllEffortSelect(id);

		return epdlistresult;

	}

}
