package com.zjp.JUC;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MyCache{
	private volatile Map<String,Object> map = new HashMap<String, Object>();
	private ReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void put(String key,Object value) {
		lock.writeLock().lock();
		try {
			System.out.println(Thread.currentThread().getName() + "开始写数据");
			map.put(key, value);
			try {
				TimeUnit.MILLISECONDS.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "写入完成");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.writeLock().unlock();
		}
	}
	public void get(String key) {
		lock.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName() + "开始读数据");
			try {
				TimeUnit.MILLISECONDS.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Object result = map.get(key);
			System.out.println(Thread.currentThread().getName() + "读取完成");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
	}
}
public class ReadWriteLockDemo {
	public static void main(String[] args) {
		MyCache myCache = new MyCache();
		for(int i=1;i<=5;i++) {
			final int tempInt = i;
			new Thread(()->{
				myCache.put(String.valueOf(tempInt), tempInt);
			}).start();
		}
		for(int i=1;i<=5;i++) {
			final int tempInt = i;
			new Thread(()->{
				myCache.get(String.valueOf(tempInt));
			}).start();
		}
	}
}
