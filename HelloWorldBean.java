package com.example.webservices.restapi;

public class HelloWorldBean {
private String message="Hello World";



public HelloWorldBean(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "HelloWorldBean [message=" + message + "]";
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
}
