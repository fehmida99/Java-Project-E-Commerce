package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "REST API",version = "1.1"),
security = {
		@SecurityRequirement(name = "basicAuth"),
		@SecurityRequirement(name = "bearerToken")
},
servers = {
		@Server(url = "/",description = "Default Server URL")
}
)
@SecuritySchemes({
	@SecurityScheme(name = "basicAuth",type = SecuritySchemeType.HTTP,scheme = "basic"),
	@SecurityScheme(name = "bearerToken",type= SecuritySchemeType.HTTP,scheme = "bearer",bearerFormat = "JWT")
})
@EnableWebSecurity(debug = true)
public class EcommerceApplication {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("                                  -=-=-=-=-=-=-=-=-=-=-=-=-=- Application is starting -=-=-=-=-=-=-=-=-=-=-=-=-=-");
		SpringApplication.run(EcommerceApplication.class, args);
		System.out.println();
		System.out.println("                                  -=-=-=-=-=-=-=-=-=-=-=-=-=- Application is working fine -=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}

}
