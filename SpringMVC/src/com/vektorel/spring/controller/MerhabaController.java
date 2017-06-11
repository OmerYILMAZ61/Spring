package com.vektorel.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vektorel.spring.service.AlanService;

@Controller
@RequestMapping("/merhaba")
public class MerhabaController {
	
	@Autowired
	AlanService alanService;

	@RequestMapping(value = "/selamcak", method = RequestMethod.GET)
	public String selamcak() {
		return "merhaba";

	}
	
	@RequestMapping(value = "/alanhesapla", method = RequestMethod.GET)
	public String alanHesapla(ModelMap map) {
		alanService.alanHesapla(3,4,3);
		map.addAttribute("text",alanService.getSonuc());
		return "merhaba";

	}
	
	@RequestMapping(value = "/alanhesaplasonuc", method = RequestMethod.GET)
	public String alanHesapSonuc(ModelMap map) {
		map.addAttribute("text",alanService.getSonuc());
		return "merhaba";

	}

}
