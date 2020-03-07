package com.zjp.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

public class TestSum {
	/**
	 * Runnable�ӿ�
	 * */
	@Test
	public void test01() {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this is run method!");
			}
		};
		r1.run();
		
		Runnable r2 = () -> System.out.println("this is lambda run method!");
		r2.run();
	}
	/**
	 * Comparator�ӿ�
	 * */
	@Test
	public void test02() {
		Comparator<Integer> com1 = new Comparator<Integer>() {
			public int compare(Integer o1,Integer o2) {
				return Integer.compare(o1, o2);
			}

		};
		System.out.println(com1.compare(13, 12));
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);//��ͷ�ұ�ֻ��һ��������䣬����return��{}������ʡ��
		System.out.println(com2.compare(1, 13));
		
	}
	/**
	 * Consumer�ӿ�
	  *  �����ͽӿ�
	 * */
	@Test
	public void test03() {
		Consumer<Integer> con1 = new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("con1������"+t);
			};
		};
		con1.accept(50);
		System.out.println("++++++++++++++++");
		Consumer<Integer> con2 = t -> System.out.println("con2������" +t);
		con2.accept(100);
	}
	
	/**
	 * Supplier�ӿ�
	  *   ��Ӧ�ͽӿ�
	 * */
	@Test
	public void test04() {
		Supplier<Integer> sup1 = new Supplier<Integer>() {
			public Integer get() {
				return 50;
			};
		};
		System.out.println("sup1:"+sup1.get());
		System.out.println("+++++++++++++++++++++++++++++");
		Supplier<Integer> sup2 = () -> 100;
		System.out.println("sup2:"+sup2.get());
	}
	
	/**
	 * Function�ӿ�
	 *   ���Բο�y=f(x)
	 * */
	@Test
	public void test05() {
		Function<Integer, Integer> fun1 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t+1;
			}
		};
		System.out.println(fun1.apply(5));
		
		System.out.println("++++++++++++++++++++++++++");
		Function<Integer,Integer> fun2 = t -> t+1;
		System.out.println(fun2.apply(6));
	}
	
	/**
	 * Predicate�ӿ�
	 * 
	 * */
	@Test
	public void test06() {
		List<String> list = Arrays.asList("����","�Ͼ�","���","����");
		Predicate<List<String>> pre1 = new Predicate<List<String>>() {
			public boolean test(List<String> t) {
				return t.contains("��");
			};
		};
		System.out.println(pre1.test(list));
		System.out.println("+++++++++++++++++++++++++");
		Predicate<List<String>> pre2 = t -> t.contains("��");
		System.out.println(pre2.test(list));
		
	}
}
