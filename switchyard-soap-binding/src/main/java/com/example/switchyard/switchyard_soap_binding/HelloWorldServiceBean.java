package com.example.switchyard.switchyard_soap_binding;

import org.switchyard.component.bean.Service;

@Service(HelloWorldService.class)
public class HelloWorldServiceBean implements HelloWorldService {

	@Override
	public String sayHello(String name) {
		String newString = name.replaceAll("\r", "").replaceAll("\n", "").trim();
		String result = "Hello, " + newString + "!";
		System.out.println(result);
		return result;
	}

}
