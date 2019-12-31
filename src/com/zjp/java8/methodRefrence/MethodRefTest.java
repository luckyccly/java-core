package com.zjp.java8.methodRefrence;

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.junit.Test;
/**
 * 方法引用的使用：
 * 1、使用情境：当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用!
 * 或者说Lambda体中的操作，已经有实现的方法，则可以用方法引用。
 * 以Consumer为例：
 * Consumer<String> con1 = str -> System.out.println(str);
 * PrintStream ps = System.out;
 * Consumer<String> con2 = ps :: println;
 * 原本Lambda体中的操作是System.out.println(str)( 原始实现方法为void accept(String str){System.out.println(str)} ),
 * void accept(String str)无返回值、一个String类型的参数，
 * 而PrintStream(System.out)类的中println方法可以实现上述Lambda体中的操作的功能，且 println方法同样无返回值、一个String类型参数。
 * 所以可以简化Lambda表达式为ps :: println
 * 
 * 2、方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数式接口的实例。所以,方法引用，也是函数式接口的实例。
 * 
 * 3、使用格式：类(对象) :: 方法名
 * 
 * 4、具体分为如下的三种情况：
 *         对象 :: 非静态方法
 *         类::静态方法
 *         类::非静态方法
 * 5、方法引用使用的要求：要求接口中抽象方法的形参列表和返回值与方法引用的方法(即类中的方法)的形参列表和返回值相同。
 * */
public class MethodRefTest {
	//情况一： 对象::实例方法
	//Consumer中的void accept(T t)
	//PrintStream中的void println(T t)
	@Test
	public void test01() {
		Consumer<String> con1 = str -> System.out.println(str);
		con1.accept("北京");
		System.out.println("*******************************");
		PrintStream ps = System.out;
		Consumer<String> con2 = ps :: println;
		con2.accept("beijing");
	}
	
	//Supplier中的T get()
	//Employee中的String getName()
	@Test
	public void test02() {
		Employee emp = new Employee(1001, "Tom", 23, 3000);
		Supplier<String> sup1 = () -> emp.getName();
		System.out.println(sup1.get());
		System.out.println("*******************************");
		Supplier sup2 = emp :: getName;
		System.out.println(sup2.get());
		
	}
	
	//情况二： 类 :: 静态方法
	//Comparator中的int compare(T t1,T t2)
	//Integer中的int compare(T t1,T t2)
	public void test03(){
		
	}

}
