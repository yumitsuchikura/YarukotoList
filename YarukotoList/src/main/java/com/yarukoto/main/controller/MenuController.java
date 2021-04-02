package com.yarukoto.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController extends BaseController {
	
	@RequestMapping("/menu")
	public ModelAndView openSearch(ModelAndView mav) {
		mav.addObject("activeTab", "menu");
		mav.setViewName("menu");
		return mav;
	}

}
