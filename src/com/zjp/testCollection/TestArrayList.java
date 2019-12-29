package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class TestArrayList {
	
	public static void main(String[] args) {
		//List list = new ArrayList(); //线程不安全
		List list = Collections.synchronizedList(new ArrayList<>()); 
		//Collections.synchronizedMap();
		//Collections.synchronizedSet();
		for (int i = 0; i < 30; i++) {
			new Thread(() ->  {
				list.add(UUID.randomUUID().toString().substring(0, 8));
				System.out.println(list);
			},String.valueOf(i)).start();
		}
		
		//多线程会出异常：java.util.ConcurrentModificationException
		
	}

}
