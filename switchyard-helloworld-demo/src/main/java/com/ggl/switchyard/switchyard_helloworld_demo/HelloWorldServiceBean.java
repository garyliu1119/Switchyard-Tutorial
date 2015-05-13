package com.ggl.switchyard.switchyard_helloworld_demo;

import org.switchyard.component.bean.Service;

@Service(HelloWorldService.class)
public class HelloWorldServiceBean implements HelloWorldService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name + "!";
	}

}
