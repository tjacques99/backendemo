package com.jacques.backendemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jacques.backendemo.controller.CryptoController;


@SpringBootApplication
public class BackendemoApplication implements CommandLineRunner{
	
	@Autowired
	private CryptoController producer;

	public static void main(String[] args) {
		SpringApplication.run(BackendemoApplication.class, args);
		System.out.print("Backend is running!");	
	}
	
	@Override
	public void run(String ...args) throws Exception{
		producer.sendMyMessage("buy more ETH");
	}

}
