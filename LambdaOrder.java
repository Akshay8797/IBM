package com.Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.Lambda.Order;
import com.Lambda.OrderList;
import com.Lambda.OrderPredicate;
import com.Lambda.OrderPredicateByAmount;
import com.Lambda.OrderPredicateByStatus;
import java.util.function.Consumer;
public class LambdaOrder {

	public static void main(String[] args) {
		List<Order> allOrders =OrderUtils.getAllOrders();
		OrderPredicate predicatestatus=(Order o)->"Completed".equals(o.getStatus());
		OrderPredicate predicateprice=(Order o)->o.getPrice()>10000;
		List<Order> filteredOrders = 
				filterOrders(allOrders, predicatestatus);
		OrderUtils.printOrders(filteredOrders);

		System.out.println("\n\t");
		
		filteredOrders = 
				filterOrders(allOrders, predicateprice);
		OrderUtils.printOrders(filteredOrders);

	}
	public static List<Order> filterOrders(List<Order> orders, OrderPredicate predicate) {
		List<Order> filteredOrders = new ArrayList<Order>();
		
		for(Order order: orders) {
			if (predicate.test(order)) {
				
				filteredOrders.add(order);
			}
		}
		return filteredOrders;
		
	}



}
class OrderUtils
{
	
		public static List<Order> getAllOrders() {
			List<Order>orders1 = new ArrayList<Order>();
			Random random = new Random();
			for(int i=0; i<10; i++) {
				int price = random.nextInt(10);
				String status = i%2 == 0 ? "Accepted" : "Completed";
				orders1.add(new Order(status, price));
			}
			return orders1;
		}
		public static void printOrders(List<Order> orders) {
			for(Order order: orders) {
				System.out.println(order);
			}
		}

}
