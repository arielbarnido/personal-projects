package com.pp.mtvns.spitter.mvc;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pp.mtvns.spitter.services.SpitterService;



@Controller
public class HomeController {

	public static final int DEFAULT_SPITTLES_PER_PAGE = 25;
	
	private SpitterService spitterService;
	
	@Inject
	public HomeController(){
		
	}
	
	
	@RequestMapping({"/","/home"})
	public String showHomePage(Map<String, Object> model){
		model.put("spittles", null);
		return "home";
	}
	
}
