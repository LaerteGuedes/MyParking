package br.com.riscozero.api.config;

import br.com.riscozero.core.config.JpaConfig;
import br.com.riscozero.core.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({JpaConfig.class, SecurityConfig.class})
@ComponentScan(basePackages = "br.com.riscozero.api.controllers")
public class RiscozeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiscozeroApplication.class, args);
	}
}
