package com.koreait.first.method1;

public class DrinkMachine {
	private Drink[] drinkArr;
	
	public DrinkMachine() {
		drinkArr = new Drink[] {
				new Drink("콜라", 500),
				new Drink("사이다", 600),
				new Drink("환타", 700),
				new Drink("2%", 600)
		};		
	}
	
	
	public void showProducts() {
		System.out.println("-- 메뉴 --");
		for(int i=0; i<drinkArr.length; i++) {
			Drink drink = drinkArr[i];
			System.out.printf("%d. %s(%d원)\n",
					i+1,
					drink.getProductName(),
					drink.getProductPrice());
		}
	}
	
	public Drink pick(int idx) {
		return drinkArr[idx - 1];
	}
}
