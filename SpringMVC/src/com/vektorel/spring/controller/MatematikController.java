package com.vektorel.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vektorel.spring.service.AlanService;
import com.vektorel.spring.service.MatematikService;

@Controller
@RequestMapping("matematik")
public class MatematikController {

	
	@Autowired
	AlanService alanService;
	
	@Autowired
	MatematikService matematikService;

	@RequestMapping(value = "/sonucgoster", method = RequestMethod.GET)
	public String selamcak(ModelMap map) {
		map.addAttribute("text",alanService.getSonuc());
		return "matematik";

	}
	
	@RequestMapping(value = "/toplama/{param1}/{param2}", method = RequestMethod.GET)
	public String toplama(ModelMap map,@PathVariable ("param1") int param1,@PathVariable("param2") int param2) {
		
		matematikService.toplama(param1, param2);
		map.addAttribute("text",alanService.getSonuc());
		map.addAttribute("sonuc",matematikService.getSonuc());
		
		return "matematik";

		
	}
	
}
