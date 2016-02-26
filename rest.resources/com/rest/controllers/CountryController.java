package com.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.rest.beans.Country;

@RestController
public class CountryController {

	
	
	
	
//	
	@RequestMapping(value = "/list", method = RequestMethod.GET,headers="Accept=application/json")  
	 public List<Country> getCountries()  
	 {  
		List<Country> list =new ArrayList<Country>(); 
		
		list.add(new Country(1, "Krakow"));
		list.add(new Country(2, "Nowy Jork"));
		list.add(new Country(3, "Los Angeles"));
		list.add(new Country(4, "Phoenix"));
		
			return list; 
	 }  
//	
	
	
	  

	  
	

}