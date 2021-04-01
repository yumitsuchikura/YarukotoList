package com.yarukoto.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarukoto.main.dao.TYarukotoMapperMod;
import com.yarukoto.main.dto.gen.TYarukoto;
import com.yarukoto.main.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	TYarukotoMapperMod tYarukotoMapperMod;
	
	public List<TYarukoto> getYarukotoList(TYarukoto tYarukoto){

		List<TYarukoto> tYarukoto_list = tYarukotoMapperMod.getYarukotoList(tYarukoto);
		
		return tYarukoto_list;
		
	}

}
