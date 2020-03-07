package com.zjp.JUC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
/**
 * 1、故障现象
 * java.util.ConcurrentModificationException
 * 2、导致原因：线程并发调用资源
 * 
 * 3、解决办法
 * List:
 * new Vector<String>()
 * Collections.synchronizedList(new ArrayList<String>())
 * new CopyOnWriteArrayList<String>()
 * CopyOnWriteArrayList：写时复制。往一个容器添加元素的时候，不直接往当前容器Object[]添加，而是先将当前容器Object[]进行Copy,复制出一个新的容器Object[] newElements，然后向新的容器
 * 						 Object[] newElements中添加元素，添加完元素之后再将原容器的引用指向新的容器setArray(newElements)；这样做的好处是可以对CopyOnWrite容器进行并发的读，
 * 						  而不需要加锁，因为当前容器不会添加任何元素。所以CopyOnWrite容器也是一种读写分离的思想，读和写不同的容器。 
 * Set:
 * new CopyOnWriteArraySet();
 * 
 * Map:
 * new ConcurrentHashMap();
 * 
 * 4、
 * 
 * */
public class NotSafeDemo03 {
	public static void main(String[] args) {
		//listNotSafe();
		//setNotSafe();
		mapNotSafe();
	}
	public static void listNotSafe() {
		List<String> list = new CopyOnWriteArrayList<String>();//Collections.synchronizedList(new ArrayList<String>());//new Vector<String>();//new ArrayList<String>();
		for(int i = 1; i <= 30; i++) {
			new Thread(() -> {
				list.add(UUID.randomUUID().toString().substring(0, 8));
				System.out.println(list);
			},String.valueOf(i)).start();
		}
	}
	public static void setNotSafe() {
		Set<String> set = new CopyOnWriteArraySet<String>();//new HashSet<String>();
		for(int i=1; i<=30; i++) {
			new Thread(()->{
				set.add(UUID.randomUUID().toString().substring(0, 8));
				System.out.println(set);
			},String.valueOf(i)).start();
		}
	}
	
	public static void mapNotSafe() {
		Map<String, String> map = new ConcurrentHashMap<String, String>();//new HashMap<String, String>();
		for(int i=1; i<30; i++) {
			new Thread(()->{
				map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,8));
				System.out.println(map);
			},String.valueOf(i)).start();
		}
	}
}
