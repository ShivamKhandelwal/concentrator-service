package com.mulesoft.demo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConcentratorService {

	public static void main(String[] args) {
		SpringApplication.run(ConcentratorService.class, args);
	}

	@RequestMapping (value = "/concentrator", method = RequestMethod.POST)
	@CrossOrigin
	public OrderResponse orders () {
		OrderResponse orderResponseExample = new OrderResponse();

		orderResponseExample.setOrderResponseExample();

		return orderResponseExample;
	}
}
