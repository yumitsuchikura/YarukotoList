package com.yarukoto.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistController extends BaseController {
	
	@RequestMapping("/openregist")
	public ModelAndView openRegist(ModelAndView mav) {
		mav.addObject("activeTab", "regist-page");
		mav.setViewName("register");
		return mav;
	}

}
