package com.zjp.JUC;

import java.util.concurrent.TimeUnit;

class Phone{
	public static synchronized void sendEmail() throws Exception {
		TimeUnit.SECONDS.sleep(4);
		System.out.println("*******sendEmail********");
	}
	public synchronized void sendSMS(){
		System.out.println("*******sendSMS********");
	}
	public void sayHello() {
		System.out.println("*********hello***********");
	}
}
/**
 * 1����׼���ʣ��ȴ�ӡ�ʼ����Ƕ���
 * 2����ͣ4s���ʼ��������ȴ�ӡ�ʼ����Ƕ���
 * 3��������ͨsayHello���������ȴ�ӡ�ʼ�����hello
 * 4�������ֻ����ȴ�ӡ�ʼ����Ƕ���
 * 5��������̬ͬ��������ͬһ���ֻ����ȴ�ӡ�ʼ����Ƕ���
 * 6��������̬ͬ��������2���ֻ����ȴ�ӡ�ʼ����Ƕ���
 * 7��1����̬ͬ��������1����ͨͬ��������ͬһ���ֻ����ȴ�ӡ�ʼ����Ƕ���
 * 8��1����̬ͬ��������1����ͨͬ��������2���ֻ����ȴ�ӡ�ʼ����Ƕ���
 * */
public class Lock8Demo05 {
	public static void main(String[] args) throws Exception {
		Phone phone = new Phone();
		Phone phone2 = new Phone();
		
		new Thread(()->{
			try {
				phone.sendEmail();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"�߳�A").start();
		
		Thread.sleep(400);
		
		new Thread(()->{
			//phone.sendSMS();
			//phone.sayHello();
			phone2.sendSMS();
		},"�߳�B").start();
	}
}
