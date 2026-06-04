package io.github.raphaelmun1z.auth_service_oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class AuthServiceOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceOauth2Application.class, args);
	}

}
