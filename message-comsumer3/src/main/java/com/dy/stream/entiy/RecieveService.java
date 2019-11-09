package com.dy.stream.entiy;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class RecieveService {
	
	// 每次收到来自input通道消息时, Spring Cloud Stream将执行此方法
	@StreamListener(Sink.INPUT)
	public void recieve(Message payload) {
		System.out.println(payload.toString());
	}
}
