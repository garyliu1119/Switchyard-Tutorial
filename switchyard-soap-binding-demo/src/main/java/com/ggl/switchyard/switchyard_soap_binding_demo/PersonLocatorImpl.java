package com.ggl.switchyard.switchyard_soap_binding_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.mvel2.optimizers.impl.refl.nodes.ArrayLength;
import org.switchyard.component.bean.Service;

@Service(PersonLocator.class)
public class PersonLocatorImpl implements PersonLocator {
	private static ConcurrentMap<String, List<Person>> personData = new ConcurrentHashMap<String, List<Person>>();
	
	public PersonLocatorImpl() {
		Person a = new Person("George", "Bush", 21);
		Person b = new Person("Jeb", "Bush", 25);
		List<Person> pList = new ArrayList<Person>();
		pList.add(a);
		pList.add(b);
		personData.put("Bush", pList);
		
		Person a1 = new Person("Madeline", "Smith", 19);
		Person b1 = new Person("Nicole", "Smith", 29);
		List<Person> pList2 = new ArrayList<Person>();
		pList2.add(a1);
		pList2.add(b1);
		personData.put("Smith", pList2);	
		
	}

	@Override
	public List<Person> findByLastName(String lastName) {
		String value = lastName.replaceAll("\n", "").trim();
		System.out.println("lastName: " + lastName);

		List<Person> resultList = (ArrayList<Person>)personData.get(value);
		
		return resultList;
	}

}
