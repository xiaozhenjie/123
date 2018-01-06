package com.项目6购物车;

public class text {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.put(Supermarket.products.get(0));
		customer.put(Supermarket.products.get(1));
		customer.put(Supermarket.products.get(1));
		customer.put(Supermarket.products.get(4));
		customer.put(Supermarket.products.get(4));
		customer.put(Supermarket.products.get(0));
		customer.put(Supermarket.products.get(1));
		customer.list();
	}

}
