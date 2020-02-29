package com.Lambda;

class Order {
	private String status;
	private int price;

	public Order(String status, int price) {
		this.status = status;
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status=status;
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


