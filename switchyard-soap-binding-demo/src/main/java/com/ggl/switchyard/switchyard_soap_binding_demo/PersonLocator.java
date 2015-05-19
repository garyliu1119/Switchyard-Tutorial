package com.ggl.switchyard.switchyard_soap_binding_demo;

import java.util.List;

public interface PersonLocator {
	List<Person> findByLastName (String lastName);
}
