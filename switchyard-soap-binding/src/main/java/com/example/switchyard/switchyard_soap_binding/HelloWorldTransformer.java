package com.example.switchyard.switchyard_soap_binding;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

public final class HelloWorldTransformer {

	@Transformer(to = "{urn:com.example.switchyard:switchyard-soap-binding:1.0}sayHelloResponse")
	public String transformStringToSayHelloResponse(String from) {
		return "<name xmlns=\"urn:com.example.switchyard:switchyard-soap-binding:1.0\">" + from + "</name>";
	}

	@Transformer(from = "{urn:com.example.switchyard:switchyard-soap-binding:1.0}sayHello")
	public String transformSayHelloToString(Element from) {
		return from.getTextContent();
	}

}
