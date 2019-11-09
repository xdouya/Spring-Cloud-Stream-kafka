package com.dy.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.dy.producer.entiy.Message;

@Service
@EnableBinding(Source.class)
public class SendServiceImpl implements SendService {

	@Autowired
	private Source source;

	@Override
	public void sendMsg(Message msg) {
		source.output().send(MessageBuilder.withPayload(msg).build());

	}

}
