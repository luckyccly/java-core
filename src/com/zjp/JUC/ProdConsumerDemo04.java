package com.zjp.JUC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AirCondition{
	private int number = 0;
//	public synchronized void increment() throws Exception {
//		//1���ж�
//		while(number != 0) {
//			this.wait();
//		}
//		//2���ɻ�
//		number++;
//		System.out.println(Thread.currentThread().getName()+"\t"+number);
//		//3��֪ͨ
//		this.notifyAll();
//		
//	}
//	public synchronized void decrement() throws Exception {
//		//1���ж�
//		while(number == 0) {
//			this.wait();
//		}
//		//2���ɻ�
//		number--;
//		System.out.println(Thread.currentThread().getName()+"\t"+number);
//		//3��֪ͨ
//		this.notifyAll();
//	}
//	
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void increment() throws Exception {
		lock.lock();
		try {
			//1���ж�
			while(number != 0) {
				condition.await();//this.wait();
			}
			//2���ɻ�
			number++;
			System.out.println(Thread.currentThread().getName()+"\t"+number);
			//3��֪ͨ
			condition.signalAll();//this.notifyAll();
		} catch (Exception e) {
			
		}finally {
			lock.unlock();
		}
	}
	
	public void decrement() throws Exception {
		lock.lock();
		try {
			//1���ж�
			while(number == 0) {
				condition.await();
			}
			//2���ɻ�
			number--;
			System.out.println(Thread.currentThread().getName()+"\t"+number);
			//3��֪ͨ
			condition.signalAll();
		} catch (Exception e) {
			
		} finally {
			lock.unlock();
		}
	}
}
/**
 * ��Ŀ�����������̣߳����Բ�����ʼֵΪ���һ������������һ���̶߳Ըñ�����1��
 * һ���̶߳Ըñ�����1��ʵ�ֽ��棬��10�֣�������ʼֵΪ�㡣
 * 
 * 1���߾ۼ������ǰ���£��̲߳�����Դ��
 * 2���жϡ��ɻ֪ͨ
 * 3����ֹ��ٻ���
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
		},"�߳�A").start();
		new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					air.decrement();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"�߳�B").start();
		new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					air.increment();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"�߳�C").start();
		new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					air.decrement();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"�߳�D").start();
	}

}
