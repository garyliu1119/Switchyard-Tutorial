package com.ggl.switchyard.demo.switchyard_rest_demo_one;

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
	public void testGetOrder() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Long message = 2L;
		Order result = service.operation("getOrder").sendInOut(message)
				.getContent(Order.class);
		Assert.assertEquals("ProductC", result.getProductId());
	}

	@Test
	public void testNewOrder() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Order message = new Order(9L, "ProductI", 10L);
		Order result = service.operation("newOrder").sendInOut(message)
				.getContent(Order.class);

		// validate the results
		Assert.assertEquals("ProductI", result.getProductId());

	}

}
