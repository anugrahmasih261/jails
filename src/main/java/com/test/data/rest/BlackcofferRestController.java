package com.test.data.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.data.entity.Blackcoffer;
import com.test.data.service.BlackcofferService;

@RestController
@CrossOrigin(origins = "*")
public class BlackcofferRestController {

	
	
	@Autowired
	private BlackcofferService blackcofferService;
	

	
	
	
	
	
	@RequestMapping("/showalldata")
	public List<Blackcoffer> findAll() {
		
		List<Blackcoffer> blackcoffer = blackcofferService.findAllUsers();
	
		
		return blackcoffer;
	}
	
	
	
	@RequestMapping("/filter")
	public List<Blackcoffer> filter_the_data(@RequestParam int endyear,
			@RequestParam String topic,@RequestParam String sector,
			@RequestParam String region,@RequestParam String pestle,
			@RequestParam String source,
			@RequestParam String swot,
			@RequestParam String country,
			@RequestParam String city)
	{
		
		
		
	
		
		return blackcofferService.filter(endyear, topic, sector, region, pestle, source, swot, country, city);
	}
	
	
}
