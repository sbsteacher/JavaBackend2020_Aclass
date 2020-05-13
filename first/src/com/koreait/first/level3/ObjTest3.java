package com.koreait.first.level3;

public class ObjTest3 {

	public static void main(String[] args) {		
		Bucket b1 = new Bucket();
		b1.num = 10;
		b1.name = "LG";
		
		System.out.println(b1.num);//10
		System.out.println(b1.name);//10
		
		Bucket b2 = new Bucket();
		b2.num = 20;
		b2.name = "SAMSUNG";
		
		System.out.println(b2.num);//10
		System.out.println(b2.name);//10
		System.out.println(b1.name);//10
		
		b1.name = "하하";
		System.out.println(b2.name);//10
		System.out.println(b1.name);//10
		
		Bucket.name = "111";
	}

}

class Bucket {
	int num;
	static String name;
}

















