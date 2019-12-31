package com.zjp.java8.methodRefrence;

import java.io.PrintStream;
import java.util.function.Consumer;

import org.junit.Test;
/**
 * 方法引用的使用：
 * 1、使用情境：当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用!
 * 
 * 2、
 * 
 * 3、使用格式：类(对象) :: 方法名
 * 
 * 4、具体分为如下的三种情况：
 *         对象 :: 非静态方法
 *         类::静态方法
 *         类::非静态方法
 * */
public class MethodRefTest {
	@Test
	public void test01() {
		Consumer<String> con1 = str -> System.out.println(str);
		con1.accept("北京");
		System.out.println("*******************************");
		PrintStream ps = System.out;
		Consumer<String> con2 = ps :: println;
		con2.accept("beijing");
	}
	@Test
	public void test02() {
		
	}

}
