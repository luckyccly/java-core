package com.zjp.Type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Test01 {
	@Test
	public void test01() {
		Point point = new Point();
		point.setVar(30);
		System.out.println(point.getVar());
	}
	@Test
	public void test02() {
	    int num = 0b11010100;
		Point<Integer> point = new Point<Integer>();
		point.setVar(num);
		System.out.println(point.getVar());
		num = num+1;
		System.out.println(num);
	}
	@Test
	public void testNotePad01() {
		NotePad<String, Integer> note = null;
		note = new NotePad<String, Integer>();
		note.setKey("key1");
		note.setValue(30);
		System.out.println("key is: "+note.getKey());
		System.out.println("value is: "+note.getValue());
	}
	@Test
	public void test03() {
		Point<Integer> point1 = new Point<Integer>();
		Point<Float> point2 = new Point<Float>();
		point1.setVar(30);
		point2.setVar(30.1f);
		fun(point1);
		fun(point2);
	}
	public static void fun(Point<? extends Number> point) {
		System.out.println(point.getVar());
	}
	@Test
	public void test04() {
		Info<Integer> info = new Info<Integer>();
		info.setVar(20);
		System.out.println(info.getVar());
		
		//Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type Info<T>
		//Info<String> info2 = new Info<String>();
	}
	@Test
	public void test05() {
		//从fun1方法返回一个泛型数组，在fun1()方法接收参数时使用了可变参数传递方式，然后将fun1()返回的泛型数组内容交给fun2()方法进行输出
		Integer i[] = fun1(1,2,3,4,5);
		fun2(i);
	}
	public static <T> T[] fun1(T...arg) {
		return arg;
	}
	public static <T> void fun2(T param[]) {
		System.out.print("接收泛型数组");
		for(T t:param) {
			System.out.print(t+"、");
		}
		System.out.println();
	}
	@Test
	public void testPersonInfo() {
		Person<Contact> contact = new Person<Contact>(new Contact("北京市", "12345678910","010123"));
		Person<Introduction> introduction = new Person<Introduction>(new Introduction("女", "丽丽", 12));
		System.out.println(contact);
		System.out.println(introduction);
	}
	@Test
	public void test06() {
		List list = new ArrayList();
		list.add("aaaa");
		list.add("bbbb");
		//Iterator it = list.iterator();
		for(int i=0;i<list.size();i++) {
			String s = (String)list.get(i);
			System.out.println(s);
		}
	}
	
	
}
