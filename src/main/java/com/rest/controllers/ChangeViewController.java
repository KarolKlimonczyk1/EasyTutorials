package com.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class ChangeViewController {

	@RequestMapping(value = "/java-basic", method = RequestMethod.GET)
	public String javaBasic() {
	
		return "javaBasic";
	}
	
	
	@RequestMapping(value = "/cplus-basic", method = RequestMethod.GET)
	public String cppBasic() {
	
		return "cpp-basic";
	}
	
}
