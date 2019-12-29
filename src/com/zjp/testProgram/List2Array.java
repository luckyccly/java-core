package com.zjp.testProgram;

import java.util.ArrayList;
import java.util.List;

/**
 * 将ArrayList转为数组
 * 
 * 
 * */
public class List2Array {
	public static Object[] test1(List list) {
		Object arr[] = new Object[list.size()] ;
		for(int i=0;i<list.size();i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
	public static Object[] test2(List list) {
		Object arr[] = new Object[list.size()];
		arr = list.toArray();
		return arr;
	}
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		
//		Object arr[] = test1(list);
		Object arr[] = test2(list);
		for(int i=0;i<arr.length;i++) {
			System.out.print((Object)arr[i]+" ");
		}
	}

}
