package com.zjp.InnerClass;
/**
 * 
 * ������̬�ڲ�������һ����ʽΪ��  �ⲿ������.�ڲ������� xxx = new �ⲿ������.�ڲ�������()
����������Ա�ڲ�������һ����ʽΪ��  �ⲿ������.�ڲ������� xxx = �ⲿ�������.new �ڲ�������()
 * */
public class InnerDemo1 {
	public static void main(String[] args) {
		InnerDemo1 innerDemo1 = new InnerDemo1();
		InnerDemo1.Bean1 bean1 = innerDemo1.new Bean1();
		bean1.I++;
		System.out.println(bean1.I);
		InnerDemo1.Bean2 bean2 = innerDemo1.new Bean2();
		bean2.K++;
		System.out.println(bean2.K);
		
	}
	
	public class Bean1{
		public int I = 0;
	}
	public class Bean2{
		public int K = 3;
	}
}
