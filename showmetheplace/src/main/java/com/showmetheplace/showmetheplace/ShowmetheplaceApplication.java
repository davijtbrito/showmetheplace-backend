package com.showmetheplace.showmetheplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
@EntityScan("com.showmetheplace.showmetheplace.entity")
public class ShowmetheplaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowmetheplaceApplication.class, args);
	}

}
