package com.yarukoto.main.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

public abstract class BaseController {
	
	protected String layout = "common/layout";
	
	@ModelAttribute("_layout_")
	public String getLayout() {
		return layout;
	}

}
