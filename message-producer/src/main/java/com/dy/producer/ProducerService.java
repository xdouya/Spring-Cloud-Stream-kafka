package com.dy.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * EnableBinding注解告诉Spring Cloud Steam将应用程序绑定到消息代理
 * @author dy
 *
 */
@SpringBootApplication
public class ProducerService {
	
	public static void main(String[] args) {
		SpringApplication.run(ProducerService.class, args);
	}
}
