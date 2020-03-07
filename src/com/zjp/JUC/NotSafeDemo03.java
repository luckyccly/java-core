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
 * 1����������
 * java.util.ConcurrentModificationException
 * 2������ԭ���̲߳���������Դ
 * 
 * 3������취
 * List:
 * new Vector<String>()
 * Collections.synchronizedList(new ArrayList<String>())
 * new CopyOnWriteArrayList<String>()
 * CopyOnWriteArrayList��дʱ���ơ���һ���������Ԫ�ص�ʱ�򣬲�ֱ������ǰ����Object[]��ӣ������Ƚ���ǰ����Object[]����Copy,���Ƴ�һ���µ�����Object[] newElements��Ȼ�����µ�����
 * 						 Object[] newElements�����Ԫ�أ������Ԫ��֮���ٽ�ԭ����������ָ���µ�����setArray(newElements)���������ĺô��ǿ��Զ�CopyOnWrite�������в����Ķ���
 * 						  ������Ҫ��������Ϊ��ǰ������������κ�Ԫ�ء�����CopyOnWrite����Ҳ��һ�ֶ�д�����˼�룬����д��ͬ�������� 
 * Set:
 * new CopyOnWriteArraySet();
 * 
 * Map:
 * new ConcurrentHashMap();
 * 
 * 4��
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
