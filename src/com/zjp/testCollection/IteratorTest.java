package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 1���������϶���
 * 2�����������Ԫ��
 * 
 * 
 * */
public class IteratorTest {
	public static void main(String[] args) {
		Collection collection = new ArrayList<>();
		
		collection.add("hello");
		collection.add("world");
		collection.add("java");
		
		Iterator iterator = collection.iterator();//ʵ�ʷ��ص���������������Ƕ�̬
		while(iterator.hasNext()) {
			String string = (String)iterator.next();//��ȡԪ�أ����ƶ�����һ��λ��
			System.out.println(string);
		}
	}
}
