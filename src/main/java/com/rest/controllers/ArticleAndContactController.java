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

@RestController
public class ArticleAndContactController {

	@Autowired
	JsonParserService jsonParserService;

	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/list", method = RequestMethod.POST, headers = "Accept=application/json")
	public Articles getArticle(@RequestBody String json)
	{
		Articles article = jsonParserService.parseArticle(json);
		article.setContent(HtmlUtils.htmlUnescape(article.getContent()));

		System.out.println(article.getContent());
//		return jsonParserService.parseArticle(json);
		return article;
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