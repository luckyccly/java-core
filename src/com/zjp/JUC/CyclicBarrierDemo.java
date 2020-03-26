package com.zjp.JUC;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(7, ()->{System.out.println("�����Ա���룬��ʼ���ᡣ");});
		for(int i = 1; i <=7; i++) {
			new Thread(()->{
				System.out.println("��"+Thread.currentThread().getName()+"�������Ա�볡");
				try {
					cyclicBarrier.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			},String.valueOf(i)).start();
		}
	}
}
