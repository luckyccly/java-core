package com.zjp.test;


public class Singleton1 {
	private Singleton1() {}
	private static Singleton1 instance = new Singleton1();
	
	public static Singleton1 getInstance() {
		return instance;
	}
	
	public String sayHello() {
		return "hello world!";
	}
}
