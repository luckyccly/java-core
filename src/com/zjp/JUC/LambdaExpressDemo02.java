package com.zjp.JUC;
@FunctionalInterface
interface Foo{
	public void sayHello();
}
@FunctionalInterface
interface TwoNum{
	public int add(int x,int y);
	public default int mul(int x,int y) {
		return x*y;
	}
	public static int sub(int x,int y) {
		return x-y;
	}
}
/**
 * 
 * 
 * */
public class LambdaExpressDemo02 {
	public static void main(String[] args) {
		Foo foo = new Foo() {
			@Override
			public void sayHello() {
				System.out.println("hello...");
			}
		};
		foo.sayHello();
		
		Foo foo1 = () -> System.out.println("hello1...");
		foo1.sayHello();
		
		System.out.println("==============================");
		TwoNum twoNum = (x,y) -> x+y;
		System.out.println(twoNum.add(10, 12));
		System.out.println(twoNum.mul(12, 2));
		System.out.println(TwoNum.sub(12, 2));
	}
	
}
