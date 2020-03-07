package com.zjp.JUC;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * ��Դ��
 * �����ͷ���ֻ��ע��Դ����
 * num��ʾһ���ж����Ż�Ʊ
 * sale������ʾ����Ʊ�Ĺ��̣�ֻҪnum����0�ͱ�ʾ���л�Ʊ���������Ϳ��Խ���if������ִ��num--��
 * */
class Ticket{
	int num = 30;
	Lock lock = new ReentrantLock();
	public void sale() {
		lock.lock();
		try {
			if(num > 0) {
				System.out.println(Thread.currentThread().getName()+"\t�����˵�"+(num--)+"��Ʊ��\t��ʣ��"+num+"��Ʊ������");
			}
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		
	}
}
/**
 * ��Ŀ��������ƱԱ��������30��Ʊ
 * ��α�д��ҵ���Ķ��̴߳��룿�̶��ı����·+ģ����ʲô��
 *    ==�ڸ��ھ۵���ϵ�ǰ���£��̡߳���������Դ��
 * �߳�=��ƱԱ������=����Tickert���sale()��������Դ��=Ʊ(Ticket��)
 * */
public class SaleTicketDemo01{
	public static void main(String[] args) {//���̣߳�һ�г�������
			Ticket ticket = new Ticket();//������Դ��
			//�����ڲ���ʵ�ַ�ʽ
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					for(int i=0;i<40;i++) {
//						ticket.sale();
//					}
//				}
//			}, "�߳�A").start();
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					for(int i=0;i<40;i++) {
//						ticket.sale();
//					}
//				}
//			}, "�߳�B").start();
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					for(int i=0;i<40;i++) {
//						ticket.sale();
//					}
//				}
//			}, "�߳�C").start();
			
			//Lambda���ʽʵ�ַ�ʽ
			new Thread(()-> {for(int i=0;i<40;i++) ticket.sale();},"�߳�A").start();
			new Thread(()-> {for(int i=0;i<40;i++) ticket.sale();},"�߳�B").start();
			new Thread(()-> {for(int i=0;i<40;i++) ticket.sale();},"�߳�C").start();
	}
}
