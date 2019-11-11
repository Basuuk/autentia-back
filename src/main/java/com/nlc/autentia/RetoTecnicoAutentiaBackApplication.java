package com.nlc.autentia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nlc.autentia.mapper")
public class RetoTecnicoAutentiaBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoTecnicoAutentiaBackApplication.class, args);
	}

}
