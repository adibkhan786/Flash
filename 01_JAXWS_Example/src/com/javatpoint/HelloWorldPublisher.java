package com.javatpoint;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:2020/ws/hello",new HelloWorldImpl());
	}
}
