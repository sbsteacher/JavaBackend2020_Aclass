package com.koreait.first.cafe;

import java.util.Scanner;

public class Customer {
	private Scanner scan = new Scanner(System.in);
	public MenuItem order(Menu menu) {
		menu.showMenus();
		while(true) {
			System.out.print("메뉴명을 작성해 주세요:");
			String selectedMenuName = scan.nextLine();
			
			MenuItem mi = menu.choose(selectedMenuName);
			
			if(mi != null) {
				return mi;
			}
			System.out.println("해당하는 제품이 없습니다.");
		}
	}
	
	public void drinkCoffee(Coffee coffee) {
		System.out.printf("%s를 마신다.", coffee.getName());
	}
}
