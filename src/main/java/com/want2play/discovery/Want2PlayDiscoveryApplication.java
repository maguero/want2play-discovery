package com.want2play.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Want2PlayDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Want2PlayDiscoveryApplication.class, args);
	}

}
