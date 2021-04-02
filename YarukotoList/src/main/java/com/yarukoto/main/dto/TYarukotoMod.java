package com.yarukoto.main.dto;

import lombok.Data;

@Data
public class TYarukotoMod {

    private Integer id;
    private String registDate;
    private String task;
    private String taskType;
    private String deadline;
    private Integer status;
    private String memo;
    private Integer deleteFlg;

}