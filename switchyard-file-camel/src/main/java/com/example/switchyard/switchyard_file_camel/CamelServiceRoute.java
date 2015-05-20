package com.example.switchyard.switchyard_file_camel;

import org.apache.camel.builder.RouteBuilder;

public class CamelServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://FileRetrievalService")
		.log("Inside FileRetrievalService Now ============>>>")
		.log("Received message for 'FileRetrievalService' : ${body}")
		.to("switchyard://XMLService?operationName=acceptMessage");
		
	}

}
