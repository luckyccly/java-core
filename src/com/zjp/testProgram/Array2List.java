package com.zjp.testProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
/**
 * 将数组转为ArrayList
 * 方法1：使用for循环
 * 方法2：使用Arrays.asList()
 * 
 * test2同test3一样使用了asList()方法。但是test3不是最好的，因为asList()返回的列表的大小是固定的。
 * 事实上，返回的列表不是java.util.ArrayList，而是定义在java.util.Arrays中一个私有静态类。
 * 我们知道ArrayList的实现本质上是一个数组，而asList()返回的列表是由原始数组支持的固定大小的列表。
 * 这种情况下，如果添加或删除列表中的元素，程序会抛出异常UnsupportedOperationException。
 * 
 * */
public class Array2List {
	public static List test1(String[] array) {
		List list = new ArrayList(array.length);
		for(int i=0;i<array.length;i++) {
			list.add(array[i]);
		}
		list.add("test1");
		return list;
	}
	public static List test2(String[] array) {
		List list = Arrays.asList(array);
		ArrayList<String> arrayList = new ArrayList<String>(list);
		arrayList.add("test2");
		return arrayList;
	}
	public static List test3(String[] array) {
		List list = Arrays.asList(array);
//		list.add("test3");//会报java.lang.UnsupportedOperationException错误
		return list;
	}
	public static List test4(String[] array) {
		List list = new ArrayList();
		Collections.addAll(list, array);
		list.add("test4");
		return list;
	}
	public static void main(String[] args) {
		String[] array = {"a1","a2","a3","a4","a5","a6"};
//		System.out.print(test1(array));
//		System.out.print(test2(array));
//		System.out.print(test3(array));
		System.out.print(test4(array));
		
	}
}
