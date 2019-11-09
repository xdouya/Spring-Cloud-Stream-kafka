package com.dy.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dy.producer.entiy.Message;
import com.dy.producer.service.SendService;

@RestController
public class MessageProducerController {

	@Autowired
	private SendService sendService;

	@PostMapping("/sendMsg")
	public void send(@RequestBody Message message) {
		sendService.sendMsg(message);
	}
	
}
