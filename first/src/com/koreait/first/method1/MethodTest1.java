package com.koreait.first.method1;

public class MethodTest1 {
	public static void main(String[] args) {		
		Money money = new Money(2000);
		Money money2 = new Money(3000);
		
		System.out.println(money.PRICE);
		System.out.println(money2.PRICE);
		//money.PRICE = 1000; //불가 > final
		
		Paper paper = new Paper("1000");
		paper.setContent("2000");
		System.out.println(paper.getContent());
		
		MacBook mb = new MacBook(15, 3.3, 16);
		mb.showInfo(); //콘솔출력: 15inch, cpu: 3.3GHz, RAM: 16GB
		
		MacBook mb2 = new MacBook(13, 2.3, 8);
		mb2.showInfo();
	}
}

class MacBook {
	private int inch;
	private double cpu;
	private int ram;
	
	MacBook(int inch, double cpu, int ram) {
		this.inch = inch;
		this.cpu = cpu;
		this.ram = ram;
	}
	
	void showInfo() {
		System.out.printf("%dinch, cpu: %.1fGhz, RAM: %dGB\n"
				, inch, cpu, ram);
	}
}

class Paper {
	private String content;
	Paper(String content) {
		this.content = content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
}

class Money {
	final int PRICE;	
	Money(int price) {
		this.PRICE = price;
	}	
}
























