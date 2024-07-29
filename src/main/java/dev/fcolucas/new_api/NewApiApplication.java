package dev.fcolucas.new_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default server URL") })
@SpringBootApplication
public class NewApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewApiApplication.class, args);
	}

}
