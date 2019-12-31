package com.zjp.java8.methodRefrence;

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.junit.Test;
/**
 * �������õ�ʹ�ã�
 * 1��ʹ���龳����Ҫ���ݸ�Lambda��Ĳ������Ѿ���ʵ�ֵķ����ˣ�����ʹ�÷�������!
 * ����˵Lambda���еĲ������Ѿ���ʵ�ֵķ�����������÷������á�
 * ��ConsumerΪ����
 * Consumer<String> con1 = str -> System.out.println(str);
 * PrintStream ps = System.out;
 * Consumer<String> con2 = ps :: println;
 * ԭ��Lambda���еĲ�����System.out.println(str)( ԭʼʵ�ַ���Ϊvoid accept(String str){System.out.println(str)} ),
 * void accept(String str)�޷���ֵ��һ��String���͵Ĳ�����
 * ��PrintStream(System.out)�����println��������ʵ������Lambda���еĲ����Ĺ��ܣ��� println����ͬ���޷���ֵ��һ��String���Ͳ�����
 * ���Կ��Լ�Lambda���ʽΪps :: println
 * 
 * 2���������ã������Ͼ���Lambda���ʽ����Lambda���ʽ��Ϊ����ʽ�ӿڵ�ʵ��������,�������ã�Ҳ�Ǻ���ʽ�ӿڵ�ʵ����
 * 
 * 3��ʹ�ø�ʽ����(����) :: ������
 * 
 * 4�������Ϊ���µ����������
 *         ���� :: �Ǿ�̬����
 *         ��::��̬����
 *         ��::�Ǿ�̬����
 * 5����������ʹ�õ�Ҫ��Ҫ��ӿ��г��󷽷����β��б�ͷ���ֵ�뷽�����õķ���(�����еķ���)���β��б�ͷ���ֵ��ͬ��
 * */
public class MethodRefTest {
	//���һ�� ����::ʵ������
	//Consumer�е�void accept(T t)
	//PrintStream�е�void println(T t)
	@Test
	public void test01() {
		Consumer<String> con1 = str -> System.out.println(str);
		con1.accept("����");
		System.out.println("*******************************");
		PrintStream ps = System.out;
		Consumer<String> con2 = ps :: println;
		con2.accept("beijing");
	}
	
	//Supplier�е�T get()
	//Employee�е�String getName()
	@Test
	public void test02() {
		Employee emp = new Employee(1001, "Tom", 23, 3000);
		Supplier<String> sup1 = () -> emp.getName();
		System.out.println(sup1.get());
		System.out.println("*******************************");
		Supplier sup2 = emp :: getName;
		System.out.println(sup2.get());
		
	}
	
	//������� �� :: ��̬����
	//Comparator�е�int compare(T t1,T t2)
	//Integer�е�int compare(T t1,T t2)
	public void test03(){
		
	}

}
