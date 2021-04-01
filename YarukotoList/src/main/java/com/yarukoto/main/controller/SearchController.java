package com.yarukoto.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yarukoto.main.form.SearchForm;

@Controller
public class SearchController {

	@RequestMapping("/")
	public ModelAndView openSearch(ModelAndView mav) {
		mav.setViewName("search");
		return mav;
	}
	
	@RequestMapping("/search_task")
	public ModelAndView searchTask(ModelAndView mav,
									@ModelAttribute("searchForm") SearchForm form) {
		System.out.println(form);
		mav.setViewName("search");
		return mav;
	}

}