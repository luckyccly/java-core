package com.zjp.Type;

public class MethodGenericDemo {
	public <T> T fun(T t){
		return t;
	}
	public static void main(String[] args) {
		MethodGenericDemo demo = new MethodGenericDemo();
		int i = demo.fun(30);
		String s = demo.fun("lihua");
		System.out.println(i);
		System.out.println(s);
	}

}
