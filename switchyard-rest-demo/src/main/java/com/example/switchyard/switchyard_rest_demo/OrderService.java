package com.example.switchyard.switchyard_rest_demo;

import java.io.IOException;

import javax.ws.rs.core.Response;

public interface OrderService {
	public Order newOrder (Order order);
	public Order getOrder (Long orderId);
}
