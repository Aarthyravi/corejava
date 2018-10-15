package com.thread.util;

public class ThreadJoinEx {

	public static void main(String[] args) {
		MyThread2 mythread = new MyThread2();
		mythread.start();
		try {
			mythread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        System.out.println("Result : "+mythread.sum);
	}

}
class MyThread2 extends Thread{
	int sum;
	public void run() {
		for(int i=0;i<=5;i++) {
			sum += i;
			System.out.println("i = "+i+" Sum = "+ sum );
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}	
	}
}