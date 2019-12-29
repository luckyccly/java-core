package com.zjp.InnerClass;

import org.junit.Test;

public class InnerTest {
	@Test
	public void test01() {
		Human h = new Human() {
			String name = "匿名内部类name";
			public void say() {
				System.out.println("这是匿名内部类重写的抽象类的方法...");
			}
		};
		System.out.println(h.name);
		h.say();
	}

}
