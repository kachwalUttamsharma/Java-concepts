package com.hcl.spring.boot.uttam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@SpringBootApplication
public class BankWebclientApplication implements WebMvcConfigurer {

	public static final String USER_SERVICE_URL = "http://bank-userservice";
	
	public static final String ACCOUNT_SERVICE_URL = "http://account-userservice";

	public static void main(String[] args) {
		SpringApplication.run(BankWebclientApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public ClientServiceUser clientServiceUser() {
		return new RemoteUserRepository(USER_SERVICE_URL);

	}
	
	@Bean
	public ClientServiceAccounts clientServiceAccounts() {
		return new RemoteAccountsRepository(ACCOUNT_SERVICE_URL);
	}
}