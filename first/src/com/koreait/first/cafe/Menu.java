package com.koreait.first.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> list = new ArrayList();
	
	public Menu() {		
		list.add(new MenuItem("아메리카노", 1500));
		list.add(new MenuItem("카푸치노", 2000));
		list.add(new MenuItem("카라멜 마키아또", 2500));
		list.add(new MenuItem("에스프레소", 2500));
	}
	
	public MenuItem choose(String selectedMenuName) {
		for(MenuItem mi : list) {
			if(mi.getName().equals(selectedMenuName)) {
				return mi;
			}
		}
		return null;
	}
	
	public void showMenus() {
		System.out.println("-- Menu --");
		for(MenuItem mi : list) {
			System.out.printf("%s (%,d원)\n"
					, mi.getName(), mi.getPrice());
		}
	}
}
