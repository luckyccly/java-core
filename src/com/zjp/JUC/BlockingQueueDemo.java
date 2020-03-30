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
		//System.out.println(queue.add("d"));//queue�ĳ���Ϊ3��add4�εĻ��ᱨ�� java.lang.IllegalStateException: Queue full
		
		//System.out.println(queue.remove("c"));
		
		/*System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		//System.out.println(queue.remove());//queue�ĳ���Ϊ3��remove4�εĻ��ᱨ��java.util.NoSuchElementException*/
//		System.out.println(queue.element());//

		/*System.out.println(queue.offer("d"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
//		System.out.println(queue.poll());//����ֵ ���Ƴ�������û�е�Ԫ��ʱ�ͻ᷵��null*/		
//		System.out.println(queue.peek());
		
//		queue.put("d");
		/*System.out.println(queue.take());
		System.out.println(queue.take());
		System.out.println(queue.take());
		System.out.println(queue.take());//����*/
		
		//		System.out.println(queue.offer("d"));
//		System.out.println(queue.offer("d", 3000, TimeUnit.MILLISECONDS));
		
		
		
	}
}
