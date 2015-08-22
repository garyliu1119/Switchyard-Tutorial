package com.example.switchyard.switchyard_rest_demo;

import org.codehaus.jackson.annotate.JsonAutoDetect;


@JsonAutoDetect
public class Order {
	private long orderId;
	
	private String productId;
	
	private long quantity;
	
	public Order() {}
	
	public Order(Long orderId, String productId, Long quantity) {
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	
}
