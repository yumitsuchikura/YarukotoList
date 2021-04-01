package com.yarukoto.main.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yarukoto.main.dto.gen.TYarukoto;
import com.yarukoto.main.form.SearchForm;
import com.yarukoto.main.service.impl.SearchServiceImpl;

@Controller
public class SearchController {
	
	@Autowired
	SearchServiceImpl searchService;

	@RequestMapping("/")
	public ModelAndView openSearch(ModelAndView mav) {
		mav.setViewName("search");
		return mav;
	}
	
	@RequestMapping("/search_task")
	public ModelAndView searchTask(ModelAndView mav,
									@ModelAttribute("searchForm") SearchForm form) {
		
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date regist_date = null;
        Date deadline = null;
		try {
			regist_date = sdFormat.parse(form.getRegist_date());
			deadline = sdFormat.parse(form.getDeadline());
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		TYarukoto tYarukoto = new TYarukoto();
		tYarukoto.setRegistDate(regist_date);
		tYarukoto.setTask(form.getTask());
		tYarukoto.setTaskType(form.getTask_type());
		tYarukoto.setDeadline(deadline);
		if(form.getStatus() != null && form.getStatus() != "") {
			tYarukoto.setStatus(Integer.parseInt(form.getStatus()));
		}
		tYarukoto.setMemo(form.getMemo());
		
		List<TYarukoto> tYarukoto_list = searchService.getYarukotoList(tYarukoto);
		
		

		mav.setViewName("search");
		return mav;
	}

}