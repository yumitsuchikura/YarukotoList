package com.yarukoto.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yarukoto.main.dao")
@SpringBootApplication
public class YarukotoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(YarukotoListApplication.class, args);
	}

}
