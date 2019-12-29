package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringIteratorDemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList<>();
		
		Student student1 = new Student("����", 13);
		Student student2 = new Student("����", 14);
		Student student3 = new Student("����", 15);
		Student student4 = new Student("����", 16);
		Student student5 = new Student("����", 17);
		
		collection.add(student1);
		collection.add(student2);
		collection.add(student3);
		collection.add(student4);
		collection.add(student5);
		
		Iterator iterator = collection.iterator();
		
		while(iterator.hasNext()) {
			Student student = (Student)iterator.next();
			System.out.println(student.getName()+"======"+student.getAge());
		}
		
	}
}
