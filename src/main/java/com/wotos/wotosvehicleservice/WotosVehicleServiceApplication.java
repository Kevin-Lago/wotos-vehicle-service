package com.wotos.wotosvehicleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WotosVehicleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WotosVehicleServiceApplication.class, args);
	}

}
