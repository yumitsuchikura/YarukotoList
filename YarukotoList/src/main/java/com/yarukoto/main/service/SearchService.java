package com.yarukoto.main.service;

import java.util.List;

import com.yarukoto.main.dto.gen.TYarukoto;

public interface SearchService {
	
	public List<TYarukoto> getYarukotoList(TYarukoto tYarukoto);

}
