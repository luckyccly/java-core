package com.zjp.testProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StringSort {

	public static void main(String[] args) {
		String txt = "my name is zhangsan,your name is lisi";
		//1����Stringת����char�ַ����飬���������еķ���ĸ���ַ��ÿո��滻
		char cs[] = txt.toCharArray();
	    for(int i=0;i<cs.length;i++) {
	    	//������Ԫ��Ϊ��ĸʱ��continue������ǰѭ��
	    	if((cs[i]>=65 && cs[i]<=90) || (cs[i]>=97 && cs[i]<=122)) {
	    		continue;
	    	}
	    	//��string�еķ���ĸ���ַ��ÿո��滻
	    	cs[i]=' ';
	    }
	    System.out.print(new String(cs));
	    
	    //2�������е�Ӣ�ĵ�����Ϊkey�������Ƶ����Ϊvalue������map��
	    Map<String,Integer> wordTimes = new HashMap<String,Integer>();
	    String[] words = new String(cs).split(" ");
	    for(int j=0;j<words.length;j++) {
	    	int num = 0;
	    	if(wordTimes.get(words[j]) != null) {
	    		num = wordTimes.get(words[j])+1;
	    	}
	    	wordTimes.put(words[j], num);
	    }
	    System.out.println();
	    System.out.print(wordTimes);
	    
	    //3������map��valueֵ��map��������
	    List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(wordTimes.entrySet());
	    Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
					
		});
	    System.out.println();
	    System.out.print(list);
	    
	}

}
