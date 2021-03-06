package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient // @RibbonClient(name = "Doctor-Service")
public class DoctorPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorPortalApplication.class, args);
	}

}
