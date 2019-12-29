package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * java.util.ConcurrentModificationException 错误产生原因：
 * 迭代器是依赖于集合存在的，在判断成功后，集合中添加了新的元素，而迭代器不知道，所以就报错了，这个错误叫做并发修改异常
 * 对于错误的描述是：迭代器遍历元素的时候，通过集合是不能修改元素的。
 * 
 * 解决方案：
 * 		1、迭代器迭代元素，迭代器添加元素(Iterator中没有add方法，可以使用子接口ListIterator的add方法)，==元素是跟在刚刚迭代的元素之后的
 * 		2、集合遍历元素，集合修改元素(普通for循环，增强for循环也会导致上述的错误)，==元素是最后添加的
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
				list.add("javaee");//会报错 java.util.ConcurrentModificationException
			}
		}*/
		
		//解决方法一：使用ListIterator
		/*ListIterator listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			String string = (String)listIterator.next();
			if("world".equals(string)) {
				listIterator.add("javaee");
			}
		}*/
		
		//解决方法二：使用普通java循环
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
