package com.koreait.first.cafe;

public class Cafe {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Customer cus = new Customer();
		Barista bari = new Barista();
				
		MenuItem mi = cus.order(menu);
		Coffee coffee = bari.makeCoffee(mi);
		cus.drinkCoffee(coffee);
	}

}
