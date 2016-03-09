package com.rest.controllers;

import java.io.IOException;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.model.Articles;
import com.rest.model.ArticlesShortcut;
import com.rest.service.ArticleService;

@RestController
public class CountryController {

	@Inject
	private ArticleService articleService;
	
	
//	
//	@RequestMapping(value = "/list", method = RequestMethod.GET,headers="Accept=application/json")  
//	 public List<Country> getCountries()  
//	 {  
//		List<Country> list =new ArrayList<Country>(); 
//		
//		list.add(new Country(1, "Krakow"));
//		list.add(new Country(2, "Nowy Jork"));
//		list.add(new Country(3, "Los Angeles"));
//		list.add(new Country(4, "Phoenix"));
//		
//		//System.out.println(articleService.getArticle(1));
//			return list; 
//	 }  
//	
	
	
	@RequestMapping(value = "/list", method = RequestMethod.POST,headers="Accept=application/json")  
	 public Articles getArticle(@RequestBody String json)//HttpEntity<String> httpEntity)  
	 {  
		System.out.println("Json: "+json);
		//String json = httpEntity.getBody();
		ArticlesShortcut asc;
		ObjectMapper mapper = new ObjectMapper();
	    try {
			asc = mapper.readValue(json, ArticlesShortcut.class);
			System.out.println("Otrzymane id: "+asc.getId());
			return articleService.getArticle(asc.getId());
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return articleService.getArticle(1);
	 }  

	  
	

}