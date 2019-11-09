package com.dy.stream.entiy;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * 定自己的SendToBinder接口，然后监听input,返回ACK表示中转站收到消息了，再转发消息出去，代码如下：
 * @author dy
 *
 */
@EnableBinding(SendToBinder.class)
public class TransFormService {

	@StreamListener("input")
	//SendTo注解:给别人一个反馈ACK
	@SendTo("output")
	public Object transform(Message payload) {
		System.out.println("消息中转：" + payload.toString());
		return payload;
	}

}
