package com.ashfak.rentcloud.configitserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigGitserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigGitserverApplication.class, args);
	}

}
