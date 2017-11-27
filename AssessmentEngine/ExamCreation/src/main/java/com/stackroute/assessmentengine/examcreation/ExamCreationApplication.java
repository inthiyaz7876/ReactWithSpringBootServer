package com.stackroute.assessmentengine.examcreation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ExamCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamCreationApplication.class, args);
	}
	@Bean
	   public RestTemplate restTemplate(RestTemplateBuilder builder) {
	      return builder.build();
	   }
}