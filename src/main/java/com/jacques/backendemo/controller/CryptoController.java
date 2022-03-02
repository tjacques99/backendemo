package com.jacques.backendemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacques.backendemo.entity.Crypto;

@RestController
public class CryptoController {

	@GetMapping("/crypto")
	public List<Crypto> getCrypto() {
		return Arrays.asList(new Crypto(1L, "ETH"));
	}
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendMyMessage(String message) {
		rabbitTemplate.convertAndSend("q.crypto", message);
	}
}
