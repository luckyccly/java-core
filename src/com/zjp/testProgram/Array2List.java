package com.zjp.testProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
/**
 * ������תΪArrayList
 * ����1��ʹ��forѭ��
 * ����2��ʹ��Arrays.asList()
 * 
 * test2ͬtest3һ��ʹ����asList()����������test3������õģ���ΪasList()���ص��б�Ĵ�С�ǹ̶��ġ�
 * ��ʵ�ϣ����ص��б���java.util.ArrayList�����Ƕ�����java.util.Arrays��һ��˽�о�̬�ࡣ
 * ����֪��ArrayList��ʵ�ֱ�������һ�����飬��asList()���ص��б�����ԭʼ����֧�ֵĹ̶���С���б�
 * ��������£������ӻ�ɾ���б��е�Ԫ�أ�������׳��쳣UnsupportedOperationException��
 * 
 * */
public class Array2List {
	public static List test1(String[] array) {
		List list = new ArrayList(array.length);
		for(int i=0;i<array.length;i++) {
			list.add(array[i]);
		}
		list.add("test1");
		return list;
	}
	public static List test2(String[] array) {
		List list = Arrays.asList(array);
		ArrayList<String> arrayList = new ArrayList<String>(list);
		arrayList.add("test2");
		return arrayList;
	}
	public static List test3(String[] array) {
		List list = Arrays.asList(array);
//		list.add("test3");//�ᱨjava.lang.UnsupportedOperationException����
		return list;
	}
	public static List test4(String[] array) {
		List list = new ArrayList();
		Collections.addAll(list, array);
		list.add("test4");
		return list;
	}
	public static void main(String[] args) {
		String[] array = {"a1","a2","a3","a4","a5","a6"};
//		System.out.print(test1(array));
//		System.out.print(test2(array));
//		System.out.print(test3(array));
		System.out.print(test4(array));
		
	}
}
