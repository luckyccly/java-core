package com.zjp.InnerClass;
/**
 * 
 * 创建静态内部类对象的一般形式为：  外部类类名.内部类类名 xxx = new 外部类类名.内部类类名()
　　创建成员内部类对象的一般形式为：  外部类类名.内部类类名 xxx = 外部类对象名.new 内部类类名()
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
