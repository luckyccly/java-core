package com.zjp.JUC;

import java.util.concurrent.Semaphore;
/**
 * 信号量的两个目的，一个是用于多个共享资源的互斥使用，另一个用于并发线程数的控制。
 * */
public class SemaphoreDemo {
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3);//模拟资源类
		for(int i=1;i <= 6;i++) {
			new Thread(()->{
				try {
					semaphore.acquire();
					System.out.println(Thread.currentThread().getName()+"抢到了车位");
					//暂停一会儿线程
					Thread.sleep(3000);
					System.out.println(Thread.currentThread().getName()+"离开了车位");
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
