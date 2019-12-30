package com.zjp.java8.methodRefrence;

import java.io.PrintStream;
import java.util.function.Consumer;

import org.junit.Test;

public class MethodRefTest {
	@Test
	public void test01() {
		Consumer<String> con1 = str -> System.out.println(str);
		con1.accept("±±¾©");
		System.out.println("*******************************");
		PrintStream ps = System.out;
		Consumer<String> con2 = ps :: println;
		con2.accept("beijing");
	}

}
