package com.example.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UaaApplication {
	/**
	 * http://localhost:9000/api/uaa/oauth/token?client_id=c1&client_secret=secret&grant_type=password&username=mingren&password=123
	 * 获取token
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(UaaApplication.class, args);
	}

}
