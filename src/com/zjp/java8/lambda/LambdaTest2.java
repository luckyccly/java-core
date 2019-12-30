package com.zjp.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.junit.Test;

public class LambdaTest2 {
	/**
	 * java内置四大函数式接口：
	 * 消费型接口：Consumer<T>    void accept(T t)
	 * 供给型接口：Supplier<T>    T get()
	 * 函数型接口：Function<T,R>  R apply(T t)
	 * 断定型接口： Predicate<T>   boolean test(T t)
	 *
	 * */
	@Test
	public void test01() {
		restTime(30, new Consumer<Double>() {
			@Override
			public void accept(Double t) {
				System.out.println("下课时间到了，休息"+t+"分钟！");
			}
			
		});
		restTime(60, t -> System.out.println("下课时间到了，休息"+t+"分钟！"));
	}
	public void restTime(double time,Consumer<Double> con) {
		con.accept(time);
	}
	@Test
	public void test02() {
		List<String> list = Arrays.asList("北京","南京","东京","望京","天津","盐津");
		List filterString = filterString(list,new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.contains("京");
			}
		});
		System.out.println(filterString);
		System.out.println("**********************");
		List filterString2 = filterString(list, t->t.contains("京"));
		System.out.println(filterString2);
	}
	
	public List<String> filterString(List<String> list,Predicate<String> pre) {
		ArrayList<String> filterList  = new ArrayList();
		for(String s:list) {
			if(pre.test(s)) {
				filterList.add(s);
			}
		}
		return filterList;
	}

}
