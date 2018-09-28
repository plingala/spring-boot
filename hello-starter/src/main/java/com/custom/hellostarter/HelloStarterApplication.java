package com.custom.hellostarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.custom.helloservice.HelloServiceImpl;
import com.custom.helloservice.IHelloService;

@Configuration
@ConditionalOnClass(IHelloService.class)
@EnableConfigurationProperties(HelloProperties.class)
public class HelloStarterApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(HelloStarterApplication.class, args);
	}
	
	@Bean
	@ConditionalOnMissingBean
	public IHelloService helloService(HelloProperties props) {
		return new HelloServiceImpl(props.getPrefix(), props.getSuffix());
	}
}