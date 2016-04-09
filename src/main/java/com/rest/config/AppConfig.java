package com.rest.config;

import java.util.Properties;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.rest.service.JsonParserService;

@Configuration
public class AppConfig {

	
	@Bean
	public Properties javaMailProperties(){
		Properties properties=new Properties();
		
		properties.setProperty("mail.transport.protocol", "smtp");
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.debug", "true");
		
		return properties;
	}
	@Bean
	public JavaMailSenderImpl mailSender(){
		JavaMailSenderImpl javaMailSender=new JavaMailSenderImpl();
		javaMailSender.setHost("smtp.gmail.com");
		javaMailSender.setPort(587);
		javaMailSender.setUsername("just4myapplication@gmail.com");
		javaMailSender.setPassword("thebestpasswordintheworld");
		
		javaMailSender.setJavaMailProperties(javaMailProperties());
		return javaMailSender;
	}
	
	
}
