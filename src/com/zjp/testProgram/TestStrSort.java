package com.zjp.testProgram;

import java.util.ArrayList;
import java.util.List;

/**
 * 将字符串进行反转 abcde->edcba
 * 分析：
 * */
public class TestStrSort {
	public static String reverse(String string) {
		
		
		return null;
	}
	public static Object[] str_split(String string,String reg) {
		List list = new ArrayList();
		while(string.contains(reg)) {
			int flag = string.indexOf(reg);
			String temp = string.substring(0,flag);
			list.add(temp);
			string = string.substring(flag+reg.length());
		}
		list.add(string);
		Object[] str_array = list.toArray();
		return str_array;
		
	}
	public static String[] splitString(String str,String flag){
		List<String> list=new ArrayList<String>();
		while(str.contains(flag)){
			int index=str.indexOf(flag);
			String tmp=str.substring(0,index);
			list.add(tmp);
			str=str.substring(index+flag.length());
		}
		list.add(str);
		String[] arr=new String[list.size()];
		for(int i=0;i<list.size();i++){
			arr[i]=list.get(i);
		}
		System.out.println("拆分的个数为【"+list.size()+"】");
		return arr;
//		return list.toArray(new String[list.size()]);
	}

    public static void main(String[] args) {
//    	String[] arr = splitString("I am a Student!", " ");
    	
    	Object[] arr = str_split("I am a Student!", " ");
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(arr[i]);
    	}
    }
}
