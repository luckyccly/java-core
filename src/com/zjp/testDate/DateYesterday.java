package com.zjp.testDate;

import java.util.Calendar;

//��ӡ����ĵ�ǰʱ��
public class DateYesterday {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1);
		System.out.println(calendar.DATE);
		System.out.println(calendar.getTime());
	}
}
