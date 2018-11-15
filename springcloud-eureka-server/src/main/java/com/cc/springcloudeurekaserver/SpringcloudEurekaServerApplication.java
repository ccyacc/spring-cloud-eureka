package com.cc.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//注册为客户端的注解
@EnableDiscoveryClient
public class SpringcloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
	}
}
