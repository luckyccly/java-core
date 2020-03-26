package com.zjp.JUC;

import java.util.concurrent.Semaphore;
/**
 * �ź���������Ŀ�ģ�һ�������ڶ��������Դ�Ļ���ʹ�ã���һ�����ڲ����߳����Ŀ��ơ�
 * */
public class SemaphoreDemo {
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3);//ģ����Դ��
		for(int i=1;i <= 6;i++) {
			new Thread(()->{
				try {
					semaphore.acquire();
					System.out.println(Thread.currentThread().getName()+"�����˳�λ");
					//��ͣһ����߳�
					Thread.sleep(3000);
					System.out.println(Thread.currentThread().getName()+"�뿪�˳�λ");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					semaphore.release();
				}
			},String.valueOf(i)).start();
		}
	}
}
