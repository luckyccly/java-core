package com.zjp.JUC;

import java.util.concurrent.TimeUnit;

class Phone{
	public static synchronized void sendEmail() throws Exception {
		System.out.println("*******sendEmailStart********");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("*******sendEmail********");
	}
	public static synchronized void sendSMS(){
		System.out.println("*******sendSMS********");
	}
	public void sayHello() {
		System.out.println("*********hello***********");
	}
}
/**
 * 1、标准访问，先打印邮件还是短信(邮件)
 * 2、暂停4s在邮件方法，先打印邮件还是短信(邮件)
 * 3、新增普通sayHello方法，是先打印邮件还是hello(hello)
 * 4、两部手机，先打印邮件还是短信(短信)
 * 5、两个静态同步方法，同一部手机，先打印邮件还是短信(邮件)
 * 6、两个静态同步方法，2部手机，先打印邮件还是短信(邮件)
 * 7、1个静态同步方法，1个普通同步方法，同一部手机，先打印邮件还是短信()
 * 8、1个静态同步方法，1个普通同步方法，2部手机，先打印邮件还是短信()
 * 
 * 笔记：
 * 1、一个对象里面如果有多个synchronized方法，某一个时刻内，只要一个线程去调用其中一个synchronized方法了，
 *           其他线程都只能等待，换句话说，某一个时刻内只能有唯一一个线程去访问这些synchronized方法
 *           锁的是当前对象this，被锁定后，其他线程都不能进入到当前对象的其他synchronized方法
 * 2、加个普通方法后，发现普通方法和同步锁无关。
 * 3、换成两个对象后，不是同一把锁了，情况立刻发生变化。
 * 4、都换成静态方法后，情况又变化
 * 5、所有的非静态同步方法用的都是同一把锁--实例对象本身。
 * 6、synchronized实现同步的基础：Java中的每一个对象都可以作为锁。
 *     具体表现为以下3中形式：
 *      对于普通同步方法，锁是当前实例对象。
 *      对于同步方法块，锁是synchronized括号里配置的对象。
 *      对于静态同步方法，锁是当前类的Class对象。
 *      
 * 7、当一个线程试图访问同步代码块时，它首先必须得到锁，退出或抛出异常时必须释放锁。
 * 也就是说如果一个实例对象的非静态同步方法获取锁后，该实例对象的其他非静态同步方法必须等待获取锁的方法释放锁或才能获取锁，
 * 可是别的实例对象的非静态同步方法因为跟该对象的非静态同步方法用的是不同的锁，
 * 所以毋需等待该实例对象已获取锁的非静态同步方法释放锁就可以获取他们自己的锁。
 * 
 * 8、所有的静态同步方法用的也是同一把锁--类对象本身
 * 这两把锁是两个不同的对象，所以静态同步方法与非静态同步方法之间是不会有竞态条件的
 * 但是一旦一个静态同步方法获取锁后，其他的静态同步方法都必须等待该方法释放锁后才能获取锁。
 * 而不管是同一个实例对象的静态方法之间，还是不同的实例对象的静态方法之间，只要它们是同一个类的实例对象！
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
		},"线程A").start();
		
		Thread.sleep(100);
		
		new Thread(()->{
			//phone.sendSMS();
			phone.sayHello();
			//phone2.sendSMS();
		},"线程B").start();
	}
}
