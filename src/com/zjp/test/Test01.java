package com.zjp.test;

import java.util.Random;

public class Test01 {
	
	public void testObject(String str1,int int2) {
		System.out.println("testObject");
	}
	
	public String testObject(int int2,String str1) {
		System.out.println("testObject + return");
		return null;
	}
	
	public String testObject(String str1,String str2) {
		System.out.println("testObject + 2 string");
		return null;
	}
	public static void main(String[] args) {
//		System.out.print("Hello World!");
		/*if (true) {
			System.out.println("It's true!");
		}
		if (false) {
			System.out.println("It's false!");
		}
		System.out.printf("Hello World! %s","HELLO");*/
		
//		String str = new String("Hello world!");
//		String substr = str.substring(0, 2);
//		System.out.print(substr);
		
		Random random = new Random();
		System.out.println(random.nextInt());
		
		
		
		
	}
}
