package com.wbd.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring boot 
 * @author zhuguanghe
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Applicaction {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Applicaction.class, args);
		
	}

}
