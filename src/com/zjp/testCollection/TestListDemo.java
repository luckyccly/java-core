package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListDemo {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("javaee");
		list.add("android");
		list.add("javaee");
		list.add("android");
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String string = (String)iterator.next();
			System.out.println(string);
		}
		
		
		
	}

}
