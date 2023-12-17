package com.mproduits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableConfigurationProperties
//@EnableDiscoveryClient
public class MproduitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MproduitsApplication.class, args);
	}
}
