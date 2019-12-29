package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.Collection;

import javax.print.attribute.standard.PrinterLocation;

/**
 * �ü��ϴ洢5��ѧ�����󣬲���ѧ��������б���
 * 
 * 1������ѧ����
 * 2���������϶���
 * 3������ѧ������
 * 4����ѧ������洢�ڼ�������
 * 5���Ѽ���ת������
 * 6����������
 * */
public class StudentCollectionDemo {
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
		
		Object[] studentArray = collection.toArray();
		
		for(int i=0;i<studentArray.length;i++) {
			Student student = (Student)studentArray[i];
			System.out.println(student.getName()+"======"+student.getAge());
		}
		
	}
}
