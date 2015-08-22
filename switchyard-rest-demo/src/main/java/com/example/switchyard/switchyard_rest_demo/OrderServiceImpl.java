package com.example.switchyard.switchyard_rest_demo;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.switchyard.component.bean.Service;

@Service(OrderService.class)
public class OrderServiceImpl implements OrderService {
	private static long ORDER_ID = 0;
	private static ConcurrentMap<Long, Order> orderMap = new ConcurrentHashMap<Long, Order>();

	
	public OrderServiceImpl() {
		orderMap.put(ORDER_ID, new Order(ORDER_ID, "ProductA", 5L )); ORDER_ID++;
		orderMap.put(ORDER_ID, new Order(ORDER_ID, "ProductB", 5L )); ORDER_ID++;
		orderMap.put(ORDER_ID, new Order(ORDER_ID, "ProductC", 5L )); ORDER_ID++;
		orderMap.put(ORDER_ID, new Order(ORDER_ID, "ProductD", 5L )); ORDER_ID++;
		orderMap.put(ORDER_ID, new Order(ORDER_ID, "ProductE", 5L )); ORDER_ID++;
		orderMap.put(ORDER_ID, new Order(ORDER_ID, "ProductF", 5L )); ORDER_ID++;
	}
	
	@Override
	public Order newOrder(Order anOrder) {
		Order result = null;
		if(anOrder == null) {
			System.out.println("null order is passed");
			//result =  new Order(ORDER_ID, "UNKNOW_PRODUCT", 0L);
		} else {
			result = new Order(ORDER_ID, anOrder.getProductId(), anOrder.getQuantity());
			orderMap.put(ORDER_ID, result);
			System.out.println("A new order is created: " + result.toString());
		}
		ORDER_ID++;
		if (result == null) {
			result = new Order (-111l, null, -111l);
		}
		return result;
	}

	@Override
	public Order getOrder(Long orderId) {
		Order anOrder = orderMap.get(orderId);
		return anOrder;
	}
}
