package com.koreait.first.algorithm;

public class Test {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		list.print();
		list.add(2, 1);		
		list.print();	
		list.remove(2);
		list.print();
		
		list.remove();
		list.print();
		
		int val = list.get(2);
		System.out.println("val : " + val);
		//5, 7, 9, 11
		
		System.out.println("size : " + list.size());
		
		
		
	}
}
