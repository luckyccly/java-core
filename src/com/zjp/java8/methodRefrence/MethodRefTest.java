package com.zjp.java8.methodRefrence;

import java.io.PrintStream;
import java.util.function.Consumer;

import org.junit.Test;
/**
 * �������õ�ʹ�ã�
 * 1��ʹ���龳����Ҫ���ݸ�Lambda��Ĳ������Ѿ���ʵ�ֵķ����ˣ�����ʹ�÷�������!
 * 
 * 2��
 * 
 * 3��ʹ�ø�ʽ����(����) :: ������
 * 
 * 4�������Ϊ���µ����������
 *         ���� :: �Ǿ�̬����
 *         ��::��̬����
 *         ��::�Ǿ�̬����
 * */
public class MethodRefTest {
	@Test
	public void test01() {
		Consumer<String> con1 = str -> System.out.println(str);
		con1.accept("����");
		System.out.println("*******************************");
		PrintStream ps = System.out;
		Consumer<String> con2 = ps :: println;
		con2.accept("beijing");
	}
	@Test
	public void test02() {
		
	}

}
