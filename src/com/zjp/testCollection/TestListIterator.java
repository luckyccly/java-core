package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListIterator {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		
		Student student1 = new Student("张三", 13);
		Student student2 = new Student("李四", 14);
		Student student3 = new Student("王五", 15);
		Student student4 = new Student("赵六", 16);
		Student student5 = new Student("田七", 17);
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Student student = (Student)iterator.next();
			System.out.println(student.getName()+"++++++"+student.getAge());
		}
	}

}
