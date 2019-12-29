package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Collection;

import javax.print.attribute.standard.PrinterLocation;

/**
 * 用集合存储5个学生对象，并把学生对象进行遍历
 * 
 * 1、创建学生类
 * 2、创建集合对象
 * 3、创建学生对象
 * 4、把学生对象存储在集合类中
 * 5、把集合转成数组
 * 6、遍历数组
 * */
public class StudentCollectionDemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList<>();
		
		Student student1 = new Student("张三", 13);
		Student student2 = new Student("李四", 14);
		Student student3 = new Student("王五", 15);
		Student student4 = new Student("赵六", 16);
		Student student5 = new Student("田七", 17);
		
		collection.add(student1);
		collection.add(student2);
		collection.add(student3);
		collection.add(student4);
		collection.add(student5);
		
		Object[] studentArray = collection.toArray();
		
		for(int i=0;i<studentArray.length;i++) {
			Student student = (Student)studentArray[i];
			System.out.println(student.getName()+"======"+student.getAge());
		}
		
	}
}
