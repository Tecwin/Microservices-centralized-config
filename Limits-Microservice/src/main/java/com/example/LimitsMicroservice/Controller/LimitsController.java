package com.example.LimitsMicroservice.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LimitsMicroservice.POJO.Configuration;
import com.example.LimitsMicroservice.POJO.Limits;

@RestController
@RequestMapping("/")
public class LimitsController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}
