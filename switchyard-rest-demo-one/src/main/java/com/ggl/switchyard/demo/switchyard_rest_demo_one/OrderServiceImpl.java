package com.ggl.switchyard.demo.switchyard_rest_demo_one;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

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
			result =  new Order(ORDER_ID, "UNKNOW_PRODUCT", 0L);
		} else {
			result = new Order(ORDER_ID, anOrder.getProductId(), anOrder.getQuantity());
		}
		ORDER_ID++;
		return result;
	}

	@Override
	public Order getOrder(Long orderId) {
		Order anOrder = orderMap.get(orderId);
		return anOrder;
	}
}
