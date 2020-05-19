package com.koreait.first.method1;

public class MethodTest3 {

	public static void main(String[] args) {
		Drink drink1 = new Drink("콜라", 500); //setter 없음
		System.out.println(drink1.getProductName()); //콜라
		System.out.println(drink1.getProductPrice()); //500

		DrinkMachine dm = new DrinkMachine();
		dm.showProducts();
		Drink drink = dm.pick(5); //콜라 드링크 객체 주소값이 넘어와야 함
		
	}

}
