package com.zjp.InnerClass;

import org.junit.Test;

public class InnerTest {
	@Test
	public void test01() {
		Human h = new Human() {
			String name = "�����ڲ���name";
			public void say() {
				System.out.println("���������ڲ�����д�ĳ�����ķ���...");
			}
		};
		System.out.println(h.name);
		h.say();
	}

}
