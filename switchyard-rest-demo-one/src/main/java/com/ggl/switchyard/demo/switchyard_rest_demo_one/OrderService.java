package com.ggl.switchyard.demo.switchyard_rest_demo_one;

public interface OrderService {
	public Order newOrder (Order order);
	public Order getOrder (Long orderId);
}
