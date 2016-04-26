package com.rest.controllers;

import com.rest.model.Articles;
import com.rest.model.EmailTemplate;
import com.rest.service.EmailService;
import com.rest.service.JsonParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticleAndContactController {

	@Autowired
	JsonParserService jsonParserService;

	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/list", method = RequestMethod.POST, headers = "Accept=application/json")
	public Articles getArticle(@RequestBody String json)
	{
		return jsonParserService.parseArticle(json);
	}

	@RequestMapping(value = "/article-list", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<Articles> getArticleList() {
		List<Articles> list = new ArrayList<Articles>();
		Articles art1 = new Articles();
		art1.setContent("das");
		art1.setId(1);
		art1.setTopic("topic1");

		Articles art2 = new Articles();
		art2.setContent("da222s");
		art2.setId(2);
		art2.setTopic("topic222");
		list.add(art1);
		list.add(art2);

		System.out.println("Article list");
		return list;
	}


	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST, headers = "Accept=application/json")
	public void sendEmail(@RequestBody String json)
	{
		EmailTemplate emailTemplate = jsonParserService.parseEmail(json);

		// message to website owner
		emailService.sendEmail("just4myapplication@gmail.com",
				"just4myapplication@gmail.com",
				"New message from EasyTutorials",
				"Message from: " + emailTemplate.getSenderEmail() + "\n"
						+ emailTemplate.getContent());

		// message to sender with information about delivered message to website owner
		emailService
				.sendEmail(
						emailTemplate.getSenderEmail(),
						"just4myapplication@gmail.com",
						"Message from EasyTutorials",
						"Many thanks for Your message. We will answer as fast as possible. \n\nThis message was generated automatically,"
								+ "	please do not answer on this message.");

	}

}