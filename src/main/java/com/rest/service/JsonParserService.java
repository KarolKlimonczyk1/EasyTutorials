package com.rest.service;

import java.io.IOException;

import javax.inject.Inject;

import com.rest.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JsonParserService {

	@Autowired
	private ArticleService articleService;

	public Articles parseArticle(String json) {
		ObjectMapper mapper = new ObjectMapper();
		ArticlesShortcut asc;

		try {
			asc = mapper.readValue(json, ArticlesShortcut.class);
			return articleService.getArticle(asc.getId());

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return articleService.getArticle(1);
	}

	public EmailTemplate parseEmail(String json) {

		EmailTemplate emailTemplate = new EmailTemplate();

		ObjectMapper mapper = new ObjectMapper();
		
		try {
			emailTemplate=mapper.readValue(json, EmailTemplate.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return emailTemplate;
	}

	public ChangedArticle parseNewArticle(String json) {

		ChangedArticle changedArticle = new ChangedArticle();

		ObjectMapper mapper = new ObjectMapper();

		try {
			changedArticle = mapper.readValue(json, ChangedArticle.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return changedArticle;

	}


	public TutorialsMenu parseTutorialsMenu(String json) {

		TutorialsMenu tutorialsMenu = new TutorialsMenu();

		ObjectMapper mapper = new ObjectMapper();

		try {
			tutorialsMenu = mapper.readValue(json, TutorialsMenu.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return tutorialsMenu;

	}

}
