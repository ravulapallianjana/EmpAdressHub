package com.AdressServices.AdressService.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AdressConfig {
	@Bean
	ModelMapper creatmodelmapper() {
		return new ModelMapper();
	}
}
