package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListDemo2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		Student student1 = new Student("Arya",18);
		Student student2 = new Student("Bran",16);
		Student student3 = new Student("Sansa",20);
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Student studnent = (Student)iterator.next();
			System.out.println(studnent.getName()+"==========="+studnent.getAge());
		}
		
		System.out.println("===================================");
		
		for(int i = 0;i<list.size();i++) {
			Student s = (Student)list.get(i);
			System.out.println(s.getName()+"========="+s.getAge());
		}
	}
}
