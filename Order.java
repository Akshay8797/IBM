package com.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

class Order1 {
	private String status;
	private int price;
	
	public Order1() {}

	public Order1(String status, int price) {
		this.status = status;
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return status + " - " + price;
	}
}

public class Order {
	public static void printOrder(ArrayList<Order1> orderList,Consumer<Order1> consumer) {
		for(Order1 order: orderList) {
			consumer.accept(order);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Order1> orderList = new ArrayList<Order1>();
		Random random = new Random();
		for(int i=0;i<40;i++) {
			String status = i%2==0 ? "ACCEPTED" : "COMPLETED";
			int price = random.nextInt(20000);
			Order1 order = new Order1(status, price);
			orderList.add(order);
		}
		
		Consumer<Order1> consumer=(Order1 order)-> {
			if(order.getPrice()>10000 && order.getStatus()=="ACCEPTED") {
				System.out.println(order);
			}
		};
		printOrder(orderList,consumer);
		
	}
}