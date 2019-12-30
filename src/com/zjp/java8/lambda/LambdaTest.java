package com.zjp.java8.lambda;

import java.util.Comparator;

import org.junit.Test;

public class LambdaTest {
	@Test
	public void test01() {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("我爱北京天安门！");
			}
		};
		r1.run();
		System.out.println("*************************************");
		Runnable r2 = () -> System.out.println("I love Beijing.");
		r2.run();
	}
	@Test
	public void test02() {
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		};
		int result1 = com1.compare(1, 2);
		System.out.println("com1 result="+result1);
		System.out.println("***********************************");
		//Lambda表达式的写法
		Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1, o2);
		Integer result2 = com2.compare(32, 33);
		System.out.println("com2 result="+result2);
		System.out.println("***********************************");
		//方法引用
		Comparator<Integer> com3 = Integer :: compare;
		int result3 = com3.compare(2, 1);
		System.out.println("com3 result="+result3);
	}

}
