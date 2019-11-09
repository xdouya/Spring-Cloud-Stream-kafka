package com.dy.stream.entiy;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SendToBinder {
	@Output("out")
	MessageChannel output();
	
	@Input("input")
	SubscribableChannel input();
}
