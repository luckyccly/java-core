package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 1、创建集合对象
 * 2、创建对添加元素
 * 
 * 
 * */
public class IteratorTest {
	public static void main(String[] args) {
		Collection collection = new ArrayList<>();
		
		collection.add("hello");
		collection.add("world");
		collection.add("java");
		
		Iterator iterator = collection.iterator();//实际返回的是子类对象，这里是多态
		while(iterator.hasNext()) {
			String string = (String)iterator.next();//获取元素，并移动到下一个位置
			System.out.println(string);
		}
	}
}
