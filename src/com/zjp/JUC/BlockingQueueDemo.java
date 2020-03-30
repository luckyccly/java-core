package com.zjp.JUC;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
		System.out.println(queue.add("a"));
		System.out.println(queue.add("b"));
		System.out.println(queue.add("c"));
		//System.out.println(queue.add("d"));//queue的长度为3，add4次的话会报错 java.lang.IllegalStateException: Queue full
		
		//System.out.println(queue.remove("c"));
		
		/*System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		//System.out.println(queue.remove());//queue的长度为3，remove4次的话会报错，java.util.NoSuchElementException*/
//		System.out.println(queue.element());//

		/*System.out.println(queue.offer("d"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
//		System.out.println(queue.poll());//特殊值 当移除队列里没有的元素时就会返回null*/		
//		System.out.println(queue.peek());
		
//		queue.put("d");
		/*System.out.println(queue.take());
		System.out.println(queue.take());
		System.out.println(queue.take());
		System.out.println(queue.take());//阻塞*/
		
		//		System.out.println(queue.offer("d"));
//		System.out.println(queue.offer("d", 3000, TimeUnit.MILLISECONDS));
		
		
		
	}
}
