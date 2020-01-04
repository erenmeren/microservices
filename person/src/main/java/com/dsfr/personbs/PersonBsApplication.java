package com.dsfr.personbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PersonBsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonBsApplication.class, args);
	}

}
