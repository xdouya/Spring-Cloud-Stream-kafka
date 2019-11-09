package com.dy.stream.entiy;

public class Message {
	String sender;
	String reciver;
	String messgaeName;
	String messageContent;
	
	public Message(String sender, String reciver, String messgaeName, String messageContent) {
		super();
		this.sender = sender;
		this.reciver = reciver;
		this.messgaeName = messgaeName;
		this.messageContent = messageContent;
	}
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReciver() {
		return reciver;
	}
	public void setReciver(String reciver) {
		this.reciver = reciver;
	}
	public String getMessgaeName() {
		return messgaeName;
	}
	public void setMessgaeName(String messgaeName) {
		this.messgaeName = messgaeName;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	
	@Override
	public String toString() {
		return sender + "-" + reciver + "-" + messgaeName + "-" + messageContent;
	}
}
