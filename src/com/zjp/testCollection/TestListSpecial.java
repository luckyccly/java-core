package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class TestListSpecial {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add(1, "111");
		list.add(2, "222");
		list.add(3,"333");
		
		/*Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			String string = (String)iterator.next();
			System.out.println(string);
		}*/
		
		//System.out.println("list get:"+list.get(1));
		
//		System.out.println("list remove:"+list.remove(1));
//		System.out.println("list set:"+list.set(1, "set 1"));
		
//		System.out.println("list:"+list);
		
		for(int i=0;i<list.size();i++) {
			String string = (String) list.get(i);
			System.out.println(string);
		}

	}
}
