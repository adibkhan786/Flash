package com.javatpoint;

import javax.jws.WebService;

@WebService(endpointInterface="com.javatpoint.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	
	public String getHelloWorldAsString(String name) {
	return "Hello World JAXWS"+name;
	}
}
