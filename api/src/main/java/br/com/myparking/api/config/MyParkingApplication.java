package br.com.myparking.api.config;

import br.com.myparking.core.config.JpaConfig;
import br.com.myparking.core.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({JpaConfig.class, SecurityConfig.class})
@ComponentScan(basePackages = "br.com.myparking.api.controllers")
public class MyParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyParkingApplication.class, args);
	}
}
