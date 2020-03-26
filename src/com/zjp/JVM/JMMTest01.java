package com.zjp.JVM;
class MyNumber{
	volatile int number = 10;
	public void changeNumber() {
		this.number = 22;
	}
}
public class JMMTest01 {
	public static void main(String[] args) {
		MyNumber myNumber = new MyNumber();
		new Thread(()->{
			System.out.println(Thread.currentThread().getName()+"**************come in************");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			myNumber.changeNumber();
			System.out.println(Thread.currentThread().getName()+" update number, value is: "+myNumber.number);
		},"AAA").start();
		while(myNumber.number == 10) {
			//需要有一种通知机制告诉main线程number已经修改，跳出while
		}
		System.out.println(Thread.currentThread().getName()+" Thread is over...");
	}
}
