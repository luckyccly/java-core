package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * java.util.ConcurrentModificationException �������ԭ��
 * �������������ڼ��ϴ��ڵģ����жϳɹ��󣬼�����������µ�Ԫ�أ�����������֪�������Ծͱ����ˣ����������������޸��쳣
 * ���ڴ���������ǣ�����������Ԫ�ص�ʱ��ͨ�������ǲ����޸�Ԫ�صġ�
 * 
 * ���������
 * 		1������������Ԫ�أ����������Ԫ��(Iterator��û��add����������ʹ���ӽӿ�ListIterator��add����)��==Ԫ���Ǹ��ڸոյ�����Ԫ��֮���
 * 		2�����ϱ���Ԫ�أ������޸�Ԫ��(��ͨforѭ������ǿforѭ��Ҳ�ᵼ�������Ĵ���)��==Ԫ���������ӵ�
 * 		
 * 
 * */
public class TestListDemo3 {
	public TestListDemo3() {
		System.out.println("constructor!!");
	}
	
	public void TestListDemo3() {
		System.out.println("this is a method....");
	}

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("hello");
		list.add("world");
		list.add("java");

		/*Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if ("world".equals(string)) {
				list.add("javaee");//�ᱨ�� java.util.ConcurrentModificationException
			}
		}*/
		
		//�������һ��ʹ��ListIterator
		/*ListIterator listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			String string = (String)listIterator.next();
			if("world".equals(string)) {
				listIterator.add("javaee");
			}
		}*/
		
		//�����������ʹ����ͨjavaѭ��
//		for (int i = 0; i < list.size(); i++) {
//			if ("world".equals(list.get(i))) {
//				list.add("javaee");
//			}
//		}
//		System.out.println(list);
		
		TestListDemo3 testListDemo3 = new TestListDemo3();
		testListDemo3.TestListDemo3();

	}

}
