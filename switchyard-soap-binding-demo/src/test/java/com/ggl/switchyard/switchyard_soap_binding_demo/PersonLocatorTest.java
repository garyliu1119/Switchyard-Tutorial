package com.ggl.switchyard.switchyard_soap_binding_demo;

import java.util.List;

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
public class PersonLocatorTest {

	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	@ServiceOperation("PersonLocator")
	private Invoker service;

	@Test
	public void testFindByLastNameBush() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		String message = "Bush";
		List<Person> result = (List<Person>)service.operation("findByLastName").sendInOut(message)
				.getContent(List.class);

		Assert.assertNotNull(result);
		for (Person p : result) {
			System.out.println(p.getFirstName() + " " +  p.getLastName() + ": age : " + p.getAge());
		}
	}
	
	@Test
	public void testFindByLastNameSmith() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		String message = "Smith";
		List<Person> result = (List<Person>)service.operation("findByLastName").sendInOut(message)
				.getContent(List.class);

		Assert.assertNotNull(result);
		for (Person p : result) {
			System.out.println(p.getFirstName() + " " +  p.getLastName() + ": age : " + p.getAge());
		}
	}
}
