package com.example.switchyard.switchyard_rest_demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonAutoDetect;


//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name="order")
@JsonAutoDetect
public class CopyOfOrder {
	//@XmlElement(name = "orderId", required=true)
	private Long orderId;
	
	//@XmlElement(name = "productId", required=true)
	private String productId;
	
	//@XmlElement(name = "quantity", required=true)
	private Long quantity;
	
	public CopyOfOrder() {}
	
	public CopyOfOrder(Long orderId, String productId, Long quantity) {
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	
}
