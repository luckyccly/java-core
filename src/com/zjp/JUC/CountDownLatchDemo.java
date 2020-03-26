package com.zjp.JUC;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(6);
		for(int i=1; i <= 6; i++) {
			new Thread(()->{
				System.out.println(Thread.currentThread().getName()+"�뿪�˽���");
				countDownLatch.countDown();
			},String.valueOf(i)).start();
		}
		countDownLatch.await();
		System.out.println(Thread.currentThread().getName()+" ��������");
	}
	public static void closeRandom() {
		for(int i=1; i <= 6; i++) {
			new Thread(()->{
				System.out.println(Thread.currentThread().getName()+"�뿪�˽���");
			},String.valueOf(i)).start();
		}
		System.out.println(Thread.currentThread().getName()+" ��������");
	}
}
