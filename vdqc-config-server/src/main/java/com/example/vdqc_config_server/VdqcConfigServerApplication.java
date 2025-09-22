package com.example.vdqc_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class VdqcConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VdqcConfigServerApplication.class, args);
	}

}
