package com.zjp.testClass;

import com.zjp.test.Singleton1;

public class TestSingleton1 {
	public static void main(String[] args) {
		Singleton1 singleton01 = Singleton1.getInstance();
		System.out.println(singleton01.sayHello());
		
	}
}
