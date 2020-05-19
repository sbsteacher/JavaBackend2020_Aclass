package com.koreait.first.method1;

class Store {
	MacBook purchaseMacBook(Money m) {
		switch(m.PRICE) {
			case 3_000_000: 
				return new MacBook(15, 3.3, 16);
			case 2_000_000:
				return new MacBook(13, 2.3, 8);
			default:
				System.out.println("맞는 금액이 없습니다.");
				return null;
		}
	}
}

public class MethodTest2 {
	public static void main(String[] args) {
		Store store = new Store();
		Money money = new Money(3_000_000);	
		
		MacBook mb = store.purchaseMacBook(money);		
		mb.showInfo(); //콘솔출력: 15inch, cpu: 3.3GHz, RAM: 16GB
		
		Money money2 = new Money(2_000_000);
		MacBook mb2 = store.purchaseMacBook(money2);
		mb2.showInfo(); //콘솔출력: 13inch, cpu: 2.3GHz, RAM: 8GB
		
		Money money3 = new Money(1_999_999);
		MacBook mb3 = store.purchaseMacBook(money3); //콘솔출력: 맞는 금액이 없습니다.
		System.out.println(mb3); //null이 출력
		

	}

}
