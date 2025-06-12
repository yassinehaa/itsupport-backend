package com.it_support_BackEnd;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ItSupportBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItSupportBackEndApplication.class, args);
	}
	@Configuration
	public static class ModelMapperConfig {
		@Bean
		public ModelMapper modelMapper() {
			return new ModelMapper();
		}
	}
}
