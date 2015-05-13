package com.ggl.switchyard.switchyard_helloworld_demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = { CDIMixIn.class })
public class HelloWorldServiceTest {

	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	@ServiceOperation("HelloWorldService")
	private Invoker service;

	@Test
	public void testSayHello() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		String message = null;
		String result = service.operation("sayHello").sendInOut(message)
				.getContent(String.class);

		Assert.assertNotNull(result);
	}

}
