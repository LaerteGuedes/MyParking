package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({JpaConfig.class, SecurityConfig.class})
public class RiscozeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiscozeroApplication.class, args);
	}
}
