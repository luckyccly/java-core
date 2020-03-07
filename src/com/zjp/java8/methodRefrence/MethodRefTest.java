package com.zjp.java8.methodRefrence;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;
/**
 * �������õ�ʹ�ã�
 * 1��ʹ���龳����Ҫ���ݸ�Lambda��Ĳ������Ѿ���ʵ�ֵķ����ˣ�����ʹ�÷�������!
 * 
 * 2���������ã������Ͼ���Lambda���ʽ����Lambda���ʽ��Ϊ����ʽ�ӿڵ�ʵ�������Է�������Ҳ�Ǻ���ʽ�ӿڵ�ʵ����
 * 
 * 3��ʹ�ø�ʽ����(����) :: ������
 * 
 * 4�������Ϊ���µ����������
 *         ���һ������ :: �Ǿ�̬����
 *         ���������::��̬����
 *         ���������::�Ǿ�̬����
 * 5����������ʹ�õ�Ҫ�󣺽ӿ��еĳ��󷽷����β��б�ͷ���ֵ�����뷽��Ӧ�õ��β��б�ͷ���ֵ������ͬ(��Ҫ���������һ�������)
 * 
 * */
public class MethodRefTest {
	//���һ������ :: �Ǿ�̬����
	/**
	 * Consumer�е�void accept(T t)
	 * PrintStream�е�viod println(T t)
	 * ʹ��PrintStream�е�println��������Consumer��Lambda��
	 * */
	@Test
	public void test01() {
		Consumer<String> con1 = str -> System.out.println(str);
		con1.accept("����");
		System.out.println("*******************************");
		PrintStream ps = System.out;
		Consumer<String> con2 = ps :: println;
		con2.accept("beijing");
		
		Consumer<Integer> con3 = ps::println;
		con3.accept(50);
		
		
	}
	/**
	 * Supplier�е�T get()
	 * Employee�е�String getName()
	 *   ʹ��Employee�е�String getName()��������Supplier��Lambda��
	 * */
	@Test
	public void test02() {
		Employee e = new Employee(1, "Tom", 30, 30000);
		Supplier<String> sup1 = () -> e.getName();
		System.out.println(sup1.get());
		System.out.println("+++++++++++++++++++++");
		Supplier<String> sup2 = e::getName;
		System.out.println(sup2.get());
		
	}
	
	//���������::��̬����
	/**
	 * Comparator�е�int compare(o1,o2)
	 * Integer�е�int compare(o1,o2)
	 * */
	@Test
	public void test03() {
		Comparator<Integer> com1 = (o1,o2) -> Integer.compare(o1, o2);
		System.out.println(com1.compare(12, 22));;
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		Comparator<Integer> com2 = Integer::compare;
		System.out.println(com2.compare(12, 22));
	}
	/**
	 * Function�е�R apply(T t)
	 * Math�е�Long round(Double d)
	 * */
	@Test
	public void test04() {
		Function<Double,Long> fun1 = d -> Math.round(d);
		System.out.println(fun1.apply(20.22));
		System.out.println("++++++++++++++++++++++++++");
		Function<Double,Long> fun2 = Math::round;
		System.out.println(fun2.apply(20.22));
	}
	//���������::�Ǿ�̬����
	/**
	 * Comparator�е�int compare(T t1,T t2)
	 * String �е�int t1.compateTo(t2)
	 * */
	@Test
	public void test05() {
		Comparator<String> com1 = (s1,s2) -> s1.compareTo(s2);
		System.out.println(com1.compare("abc", "bcd"));
		System.out.println("++++++++++++++++++++++++++");
		Comparator<String> com2 = String::compareTo;
		System.out.println(com2.compare("abc", "bcd"));
	}
	
	/**
	 * BiPredicate�е�boolean test(T t1,T t2);
	 * String �е�boolean t1.equals(t2)
	 * 
	 * */
	@Test
	public void test06() {
		BiPredicate<String, String> pre1 = (s1,s2) -> s1.equals(s2);
		System.out.println(pre1.test("abc", "bcd"));
		System.out.println("++++++++++++++++++++++++++");
		BiPredicate<String, String> pre2 = String :: equals;
		System.out.println(pre2.test("abc", "bcd"));
	}
	
	/**
	 * Function�е�R apply(T t)
	 * Employee�е�String getName();
	 * */
	@Test
	public void test07() {
		Employee employee = new Employee(1,"Tom",25,10000);
		Function<Employee, String> func1 = e -> e.getName();
		System.out.println(func1.apply(employee));
		System.out.println("++++++++++++++++++++++++++");
		
		Function<Employee, String> func2 = Employee :: getName;
		System.out.println(func2.apply(employee));
	}
	
}
