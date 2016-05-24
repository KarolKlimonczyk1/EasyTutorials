package com.rest.config;

import java.util.Properties;

import javax.inject.Inject;

import com.rest.dao.ArticlesDAO;
import com.rest.dao.ArticlesDAOImpl;
import com.rest.model.Articles;
import com.rest.service.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.rest.service.JsonParserService;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.rest.*")
public class AppConfig extends WebMvcConfigurerAdapter {


//	@Autowired
//	RoleToUserProfileConverter roleToUserProfileConverter;

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}


//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/login").setViewName("login");
//		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//	}
//
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/static/**").addResourceLocations("/static/");
}

//	@Override
//	public void addFormatters(FormatterRegistry registry) {
//		registry.addConverter(roleToUserProfileConverter);
//	}

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
