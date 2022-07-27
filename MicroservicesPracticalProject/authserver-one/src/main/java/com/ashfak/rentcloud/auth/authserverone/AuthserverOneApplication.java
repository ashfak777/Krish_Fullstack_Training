package com.ashfak.rentcloud.auth.authserverone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class AuthserverOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthserverOneApplication.class, args);
	}

}
