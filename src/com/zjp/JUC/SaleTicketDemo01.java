package com.zjp.JUC;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 资源类
 * 变量和方法只关注资源本身
 * num表示一共有多少张火车票
 * sale方法表示卖火车票的过程，只要num大于0就表示还有火车票可以卖，就可以进入if方法中执行num--，
 * */
class Ticket{
	int num = 30;
	Lock lock = new ReentrantLock();
	public void sale() {
		lock.lock();
		try {
			if(num > 0) {
				System.out.println(Thread.currentThread().getName()+"\t卖掉了第"+(num--)+"张票；\t还剩下"+num+"张票。。。");
			}
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		
	}
}
/**
 * 题目：三个售票员、卖出、30张票
 * 如何编写企业级的多线程代码？固定的编程套路+模板是什么？
 *    ==在高内聚低耦合的前提下，线程、操作、资源类
 * 线程=售票员，操作=调用Tickert类的sale()方法，资源类=票(Ticket类)
 * */
public class SaleTicketDemo01{
	public static void main(String[] args) {//主线程，一切程序的入口
			Ticket ticket = new Ticket();//创建资源类
			//匿名内部类实现方式
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					for(int i=0;i<40;i++) {
//						ticket.sale();
//					}
//				}
//			}, "线程A").start();
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					for(int i=0;i<40;i++) {
//						ticket.sale();
//					}
//				}
//			}, "线程B").start();
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					for(int i=0;i<40;i++) {
//						ticket.sale();
//					}
//				}
//			}, "线程C").start();
			
			//Lambda表达式实现方式
			new Thread(()-> {for(int i=0;i<40;i++) ticket.sale();},"线程A").start();
			new Thread(()-> {for(int i=0;i<40;i++) ticket.sale();},"线程B").start();
			new Thread(()-> {for(int i=0;i<40;i++) ticket.sale();},"线程C").start();
	}
}
