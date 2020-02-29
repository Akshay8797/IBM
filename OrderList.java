package com.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.Lambda.Order;

public class OrderList {

	private static List<Order> orderList = new ArrayList<Order>();
	static {
		Random random = new Random();
		for(int i=0;i<10;i++) {
			String status = i%2==0 ? "Accepted" : "Completed";
			int price = random.nextInt(5);
			Order order = new Order(status,price);
			orderList.add(order);
		}
	}
	public static List<Order> getOrders() {
		return orderList;
	}
}