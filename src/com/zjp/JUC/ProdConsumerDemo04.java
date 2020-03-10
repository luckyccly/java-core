package com.zjp.JUC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AirCondition{
	private int number = 0;
//	public synchronized void increment() throws Exception {
//		//1、判断
//		while(number != 0) {
//			this.wait();
//		}
//		//2、干活
//		number++;
//		System.out.println(Thread.currentThread().getName()+"\t"+number);
//		//3、通知
//		this.notifyAll();
//		
//	}
//	public synchronized void decrement() throws Exception {
//		//1、判断
//		while(number == 0) {
//			this.wait();
//		}
//		//2、干活
//		number--;
//		System.out.println(Thread.currentThread().getName()+"\t"+number);
//		//3、通知
//		this.notifyAll();
//	}
//	
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void increment() throws Exception {
		lock.lock();
		try {
			//1、判断
			while(number != 0) {
				condition.await();//this.wait();
			}
			//2、干活
			number++;
			System.out.println(Thread.currentThread().getName()+"\t"+number);
			//3、通知
			condition.signalAll();//this.notifyAll();
		} catch (Exception e) {
			
		}finally {
			lock.unlock();
		}
	}
	
	public void decrement() throws Exception {
		lock.lock();
		try {
			//1、判断
			while(number == 0) {
				condition.await();
			}
			//2、干活
			number--;
			System.out.println(Thread.currentThread().getName()+"\t"+number);
			//3、通知
			condition.signalAll();
		} catch (Exception e) {
			
		} finally {
			lock.unlock();
		}
	}
}
/**
 * 题目：现在两个线程，可以操作初始值为零的一个变量，是想一个线程对该变量加1，
 * 一个线程对该变量减1，实现交替，来10轮，变量初始值为零。
 * 
 * 1、高聚集低耦合前提下，线程操作资源类
 * 2、判断、干活、通知
 * 3、防止虚假唤醒
 * 
 * */
public class ProdConsumerDemo04 {
	public static void main(String[] args) {
		AirCondition air = new AirCondition();
		new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					air.increment();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"线程A").start();
		new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					air.decrement();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"线程B").start();
		new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					air.increment();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"线程C").start();
		new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					air.decrement();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"线程D").start();
	}

}
