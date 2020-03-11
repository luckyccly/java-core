package com.zjp.java8.lambda;
/**
 *Lambda表达式的使用
 *
 *1、举例：(o1,o2) -> Integer.compare(o1,o2)
 *2、格式：
  *           箭头(->)：Lambda操作符或箭头操作符
  *           箭头(->)左边：Lambda形参列表(实际上是接口中的抽象方法的形参列表)
  *           箭头(->)右边：Lambda体(实际上是重写的抽象方法的方法体)
 *3、Lambda表达式的使用：(分为6中情况介绍)
 *    ①箭头(->)左边：Lambda形参列表的参数类型可以省略(数据推断)；如果形参列表只有一个参数则括号可以省略；如果没有参数或者有多个参数的时候括号不可以省。
 *    ②箭头(->)右边：Lambda体应该使用一对大括号{}包裹；如果Lambda体只有一条执行语句(可能是return语句)，可以省略return关键字和大括号{}；如果有多条语句时，则大括号{}不可以省略。
 *    为什么形参列表可以省略呢？
 *     因为可以在声明接口时指定数据类型，然后根据“类型推断”判断参数形参数据类型
 *     例如Comparator<Integer> com2 = (o1,o2) -> o1.compareTo(o2);因为左边声明接口时使用Comparator<Integer> com2,所以可以根据接口的泛型推断出o1,o2的类型，
 *     如果左边接口没有泛型的话，则Lambda表达式的数据类型不能省略需要写成：Comparator com2 = (o1,o2) -> ((Integer) o1).compareTo((Integer) o2);
 *    
 *4、Lambda表达式的实质：作为函数式接口的一个实例(对象)
 *5、如果一个接口中只声明了一个抽象方法，则此接口称为函数式接口。
 *6、以前用匿名内部类实现的接口的实例化，现在可以通过Lambda表达式来实现。
 * 
 * 
 * */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class LambdaTest1 {
	//语法格式一：无参，无返回值
	@Test
	public void test01() {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("我爱北京天安门！");
				
			}
		};
		r1.run();
		System.out.println("********************************");
		Runnable r2 = () -> {System.out.println("I love BJ!");};
		r2.run();
	}
	//语法格式二：Lambda需要一个参数，但是没有返回值
	@Test
	public void test02() {
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		con.accept("你好吗？");
		System.out.println("********************************");
		Consumer<String> con1 = (String t) -> {System.out.println(t);};
		con1.accept("How are you!");
	}
	//语法格式三：数据类型可以省略，因为可以由编译器推断得出，称为“类型推断”
	@Test
	public void test03() {
		Consumer<String> con1 = (t) -> {System.out.println(t);};
		con1.accept("How are you!");
		//类型推断的其他用例
		List<String> list = new ArrayList<>();//类型推断
		//JDK1.7 版本之前，创建集合对象必须把前后的泛型都写上
		//JDK1.7 版本之后，=号后边的泛型可以省略，后边的泛型可以根据前边的泛型推导出来--》类型推断
		int[] num = {1,2,3};//类型推断
	}
	//语法格式四：Lambda若只需一个参数时，参数的小括号可以省略
	@Test
	public void test04() {
		Consumer<String> con1 = t -> {System.out.println(t);};
		con1.accept("How are you!");
	}
	//语法格式五：Lambda需要两个或两个以上的参数，多条执行语句，并且有返回值。
	@Test
	public void test05() {
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println(o1);
				System.out.println(o2);
				return o1.compareTo(o2);
			}
		};
		System.out.println(com1.compare(32, 2));
		System.out.println("****************************");
		Comparator<Integer> com2 = (o1,o2) -> {
			System.out.println(o1);
			System.out.println(o2);
			return o1.compareTo(o2);
			};
		System.out.println(com2.compare(11, 22));
		
	}
	//语法格式六：Lambda体只有一条语句时，return与 大括号若都有，则都可以省略
	@Test
	public void test06() {
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println(com1.compare(32, 2));
		System.out.println("****************************");
		Comparator<Integer> com2 = (o1,o2) -> o1.compareTo(o2);
		System.out.println(com2.compare(1, 34));
	}
	
	@Test
	public void test07(){
		Comparator<Integer> comparator = (Integer x,Integer y) -> Integer.compare(x,y);
		//Comparator com2 = (Integer o1,Integer o2) -> o1.compareTo(o2);  会报错？
        System.out.println(comparator.compare(5,6));
	}

}
