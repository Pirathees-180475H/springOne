package com.jenKins.jenkinsTrail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class JenkinsTrailApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(JenkinsTrailApplication.class, args);
		System.out.println("Welcome From Jenkins Version 1");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JenkinsTrailApplication.class);
	}

}
