package br.com.riscozero.admin.config;

import br.com.riscozero.admin.config.security.CustomAccessDeniedHandler;
import br.com.riscozero.admin.config.security.SecurityConfig;
import br.com.riscozero.admin.config.security.WebMvcConfig;
import br.com.riscozero.core.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({JpaConfig.class, SecurityConfig.class, WebMvcConfig.class, CustomAccessDeniedHandler.class})
@ComponentScan(basePackages = {"br.com.riscozero.admin.controllers", "br.com.riscozero.core.services"})
public class RiscozeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiscozeroApplication.class, args);
	}
}
