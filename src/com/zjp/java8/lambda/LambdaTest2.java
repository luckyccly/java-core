package com.zjp.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.junit.Test;

public class LambdaTest2 {
	/**
	 * java�����Ĵ���ʽ�ӿڣ�
	 * �����ͽӿڣ�Consumer<T>    void accept(T t)
	 * �����ͽӿڣ�Supplier<T>    T get()
	 * �����ͽӿڣ�Function<T,R>  R apply(T t)
	 * �϶��ͽӿڣ� Predicate<T>   boolean test(T t)
	 *
	 * */
	@Test
	public void test01() {
		restTime(30, new Consumer<Double>() {
			@Override
			public void accept(Double t) {
				System.out.println("�¿�ʱ�䵽�ˣ���Ϣ"+t+"���ӣ�");
			}
			
		});
		restTime(60, t -> System.out.println("�¿�ʱ�䵽�ˣ���Ϣ"+t+"���ӣ�"));
	}
	public void restTime(double time,Consumer<Double> con) {
		con.accept(time);
	}
	@Test
	public void test02() {
		List<String> list = Arrays.asList("����","�Ͼ�","����","����","���","�ν�");
		List filterString = filterString(list,new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.contains("��");
			}
		});
		System.out.println(filterString);
		System.out.println("**********************");
		List filterString2 = filterString(list, t->t.contains("��"));
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
