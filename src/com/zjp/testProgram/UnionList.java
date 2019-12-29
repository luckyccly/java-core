package com.zjp.testProgram;

import java.util.ArrayList;
import java.util.List;

public class UnionList {
    public static void main(String[] args) {
    	List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        List<String> list2 = new ArrayList<String>();
        list2.add("C");
        list2.add("B");
        list2.add("D");
        // ����
        list1.addAll(list2);
        // ȥ�ظ�����
        list2.removeAll(list1);
        list1.addAll(list2);
        // ����
        list1.retainAll(list2);
        // �
        list1.removeAll(list2);
    	System.out.print(list1);
    }
}
