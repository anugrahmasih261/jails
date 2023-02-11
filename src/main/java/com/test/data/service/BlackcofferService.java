package com.test.data.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.data.dao.BlackcofferDAO;
import com.test.data.entity.Blackcoffer;

@Service
public class BlackcofferService {
	
	@Autowired
	BlackcofferDAO blackcofferDAO;
	
	
	  
	 public List<Blackcoffer> findAllUsers() {
		    return blackcofferDAO.findAll();
		  }
		

public List<Blackcoffer> filter(int endyear,String topic,String sector,
		String region,String pestle,
		String source,
		String swot,
		 String country,
		 String city) {
	
	Predicate<Blackcoffer> endYearCondition;
	Predicate<Blackcoffer> topicsCondition;
	Predicate<Blackcoffer> sectorCondition;
	Predicate<Blackcoffer> regionCondition;
	Predicate<Blackcoffer> countryCondition;
	Predicate<Blackcoffer> swotCondition;
	Predicate<Blackcoffer> sourceCondition;
	Predicate<Blackcoffer> pestleCondition;
	Predicate<Blackcoffer> cityCondition;
	
	List<Blackcoffer> blackcoffers=blackcofferDAO.findAll();
	
	
	if(endyear==0) {
		 endYearCondition = Blackcoffer -> Blackcoffer.getEnd_Year() != 0;
	 
	}
	else {
		endYearCondition = Blackcoffer -> Blackcoffer.getEnd_Year() == endyear;
		}
	
	if(topic.equals(""))
	{
		topicsCondition = Blackcoffer -> !Blackcoffer.getTopic().equals(topic);
	}
	else {
		
		topicsCondition = Blackcoffer -> Blackcoffer.getTopic().equals(topic);
	}
	if(sector.equals(""))
	{
		sectorCondition = Blackcoffer -> Blackcoffer.getSector()!=null;
	
	}
	else
	{
		sectorCondition = Blackcoffer -> Blackcoffer.getSector().equals(sector);
		}
	
	
	if(region.equals("")) {
		 regionCondition = Blackcoffer -> Blackcoffer.getRegion()!=null;
	}
	else {
		
		 regionCondition = Blackcoffer -> Blackcoffer.getRegion().equals(region);
	}
	
	if(pestle.equals("")) {
		 pestleCondition = Blackcoffer -> Blackcoffer.getPestle()!=null;
	 
	}
	 else {
		pestleCondition = Blackcoffer -> Blackcoffer.getPestle().equals(pestle);
	}
	if(source.equals(""))
	{sourceCondition = Blackcoffer -> Blackcoffer.getSource()!=null;
	 
	}
	else {
		sourceCondition = Blackcoffer -> Blackcoffer.getSource().equals(source);
	}
	
	if(swot.equals(""))
	{ swotCondition = Blackcoffer -> Blackcoffer.getSwot()!=null;
		
	}
	else {
		 swotCondition = Blackcoffer -> Blackcoffer.getSwot().equals(swot);	
	}
	
	if(country.equals("")) {
		countryCondition = Blackcoffer -> Blackcoffer.getCountry()!=null;
	
	}
	else {
		 countryCondition = Blackcoffer -> Blackcoffer.getCountry().equals(country);
	}
	
	if(city.equals("")) {
		 cityCondition = Blackcoffer -> Blackcoffer.getCity()!=null;
	
	}
	else {
		 cityCondition = Blackcoffer -> Blackcoffer.getCity().equals(city);
	}
	List<Blackcoffer> filteredBlackcoffer = blackcoffers.stream()
	    .filter(endYearCondition.and(topicsCondition)
	    		.and(sectorCondition).and(regionCondition)
	    		.and(pestleCondition).and(sourceCondition)
	    		.and(swotCondition).and(countryCondition)
	    		.and(cityCondition))
	    .collect(Collectors.toList());
	
	
	
	
    return filteredBlackcoffer;
  }
}