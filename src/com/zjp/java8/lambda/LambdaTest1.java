package com.zjp.java8.lambda;
/**
 *Lambda���ʽ��ʹ��
 *
 *1��������(o1,o2) -> Integer.compare(o1,o2)
 *2����ʽ��
  *           ��ͷ(->)��Lambda���������ͷ������
  *           ��ͷ(->)��ߣ�Lambda�β��б�(ʵ�����ǽӿ��еĳ��󷽷����β��б�)
  *           ��ͷ(->)�ұߣ�Lambda��(ʵ��������д�ĳ��󷽷��ķ�����)
 *3��Lambda���ʽ��ʹ�ã�(��Ϊ6���������)
 *    �ټ�ͷ(->)��ߣ�Lambda�β��б�Ĳ������Ϳ���ʡ��(�����ƶ�)������β��б�ֻ��һ�����������ſ���ʡ�ԣ����û�в��������ж��������ʱ�����Ų�����ʡ��
 *    �ڼ�ͷ(->)�ұߣ�Lambda��Ӧ��ʹ��һ�Դ�����{}���������Lambda��ֻ��һ��ִ�����(������return���)������ʡ��return�ؼ��ֺʹ�����{}������ж������ʱ���������{}������ʡ�ԡ�
 *    Ϊʲô�β��б����ʡ���أ�
 *     ��Ϊ�����������ӿ�ʱָ���������ͣ�Ȼ����ݡ������ƶϡ��жϲ����β���������
 *     ����Comparator<Integer> com2 = (o1,o2) -> o1.compareTo(o2);��Ϊ��������ӿ�ʱʹ��Comparator<Integer> com2,���Կ��Ը��ݽӿڵķ����ƶϳ�o1,o2�����ͣ�
 *     �����߽ӿ�û�з��͵Ļ�����Lambda���ʽ���������Ͳ���ʡ����Ҫд�ɣ�Comparator com2 = (o1,o2) -> ((Integer) o1).compareTo((Integer) o2);
 *    
 *4��Lambda���ʽ��ʵ�ʣ���Ϊ����ʽ�ӿڵ�һ��ʵ��(����)
 *5�����һ���ӿ���ֻ������һ�����󷽷�����˽ӿڳ�Ϊ����ʽ�ӿڡ�
 *6����ǰ�������ڲ���ʵ�ֵĽӿڵ�ʵ���������ڿ���ͨ��Lambda���ʽ��ʵ�֡�
 * 
 * 
 * */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class LambdaTest1 {
	//�﷨��ʽһ���޲Σ��޷���ֵ
	@Test
	public void test01() {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("�Ұ������찲�ţ�");
				
			}
		};
		r1.run();
		System.out.println("********************************");
		Runnable r2 = () -> {System.out.println("I love BJ!");};
		r2.run();
	}
	//�﷨��ʽ����Lambda��Ҫһ������������û�з���ֵ
	@Test
	public void test02() {
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		con.accept("�����");
		System.out.println("********************************");
		Consumer<String> con1 = (String t) -> {System.out.println(t);};
		con1.accept("How are you!");
	}
	//�﷨��ʽ�����������Ϳ���ʡ�ԣ���Ϊ�����ɱ������ƶϵó�����Ϊ�������ƶϡ�
	@Test
	public void test03() {
		Consumer<String> con1 = (t) -> {System.out.println(t);};
		con1.accept("How are you!");
		//�����ƶϵ���������
		List<String> list = new ArrayList<>();//�����ƶ�
		//JDK1.7 �汾֮ǰ���������϶�������ǰ��ķ��Ͷ�д��
		//JDK1.7 �汾֮��=�ź�ߵķ��Ϳ���ʡ�ԣ���ߵķ��Ϳ��Ը���ǰ�ߵķ����Ƶ�����--�������ƶ�
		int[] num = {1,2,3};//�����ƶ�
	}
	//�﷨��ʽ�ģ�Lambda��ֻ��һ������ʱ��������С���ſ���ʡ��
	@Test
	public void test04() {
		Consumer<String> con1 = t -> {System.out.println(t);};
		con1.accept("How are you!");
	}
	//�﷨��ʽ�壺Lambda��Ҫ�������������ϵĲ���������ִ����䣬�����з���ֵ��
	@Test
	public void test05() {
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println(o1);
				System.out.println(o2);
				return o1.compareTo(o2);
			}
		};
		System.out.println(com1.compare(32, 2));
		System.out.println("****************************");
		Comparator<Integer> com2 = (o1,o2) -> {
			System.out.println(o1);
			System.out.println(o2);
			return o1.compareTo(o2);
			};
		System.out.println(com2.compare(11, 22));
		
	}
	//�﷨��ʽ����Lambda��ֻ��һ�����ʱ��return�� �����������У��򶼿���ʡ��
	@Test
	public void test06() {
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println(com1.compare(32, 2));
		System.out.println("****************************");
		Comparator<Integer> com2 = (o1,o2) -> o1.compareTo(o2);
		System.out.println(com2.compare(1, 34));
	}
	
	@Test
	public void test07(){
		Comparator<Integer> comparator = (Integer x,Integer y) -> Integer.compare(x,y);
		//Comparator com2 = (Integer o1,Integer o2) -> o1.compareTo(o2);  �ᱨ��
        System.out.println(comparator.compare(5,6));
	}

}
