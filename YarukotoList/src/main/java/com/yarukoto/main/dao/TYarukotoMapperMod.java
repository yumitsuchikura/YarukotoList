package com.yarukoto.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yarukoto.main.dto.gen.TYarukoto;

@Mapper
public interface TYarukotoMapperMod {

    List<TYarukoto> getYarukotoList(TYarukoto tYarukoto);

}