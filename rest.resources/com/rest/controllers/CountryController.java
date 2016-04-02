package com.rest.controllers;

import java.io.IOException;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.model.Articles;
import com.rest.model.ArticlesShortcut;
import com.rest.model.EmailTemplate;
import com.rest.service.ArticleService;
import com.rest.service.EmailService;

@RestController
public class CountryController {

	@Inject
	private ArticleService articleService;
	
	@Inject
	private EmailService emailService;
	
	@RequestMapping(value = "/list", method = RequestMethod.POST,headers="Accept=application/json")  
	 public Articles getArticle(@RequestBody String json)//HttpEntity<String> httpEntity)  
	 {  
		//System.out.println("Json: "+json);
		ArticlesShortcut asc;
		ObjectMapper mapper = new ObjectMapper();
	    try {
			asc = mapper.readValue(json, ArticlesShortcut.class);
//			System.out.println("Otrzymane id: "+asc.getId());
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
	
	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST,headers="Accept=application/json")  
	 public void getArticles(@RequestBody String json)//HttpEntity<String> httpEntity)  
	 {  
		System.out.println("Json: "+json);
		
		EmailTemplate emailTemplate=new EmailTemplate();
		
		ObjectMapper mapper=new ObjectMapper();
		
		try {
			emailTemplate=mapper.readValue(json, EmailTemplate.class);
			
			// message to website owner 
			emailService.sendEmail("just4myapplication@gmail.com", "just4myapplication@gmail.com", "New message from EasyTutorials",
					"Message from: "+ emailTemplate.getSenderEmail()+"\n"+emailTemplate.getContent());
			
			// message to sender with information about delivered message to website owner
			emailService.sendEmail(emailTemplate.getSenderEmail(), "just4myapplication@gmail.com", "Message from EasyTutorials",
					"Many thanks for Your message. We will answer as fast as possible. \n\nThis message was generated automatically,"
					+ "	please do not answer on this message.");
			
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
		
		
	    
	 } 


}