package com.example.switchyard.switchyard_rest_demo;

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
public class OrderServiceTest {

	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	@ServiceOperation("OrderService")
	private Invoker service;

	@Test
	public void testNewOrder() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Order message = new Order(9L, "MY-PRODUCTION-ID", 99L);
		Order result = service.operation("newOrder").sendInOut(message)
				.getContent(Order.class);
		Assert.assertEquals("MY-PRODUCTION-ID", result.getProductId());
	}

	@Test
	public void testGetOrder() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Long message = 1L;
		Order result = service.operation("getOrder").sendInOut(message)
				.getContent(Order.class);
		Assert.assertEquals("ProductB", result.getProductId());
	}

}
