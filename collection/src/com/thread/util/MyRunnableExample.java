package com.thread.util;

public class MyRunnableExample {

	public static void main(String[] args) {
		MyRunnable myRunnable1 = new MyRunnable("Thread-0");
		Thread thread1 = new Thread(myRunnable1);
		thread1.start();
        
		MyRunnable myRunnable2 = new MyRunnable("Thread-1");
		Thread thread2 = new Thread(myRunnable2);
		thread2.start();
	}

}

class MyRunnable implements Runnable{
	String name;
	
	public MyRunnable(String name) {
		super();
		this.name = name;
	}

	public void run() {
		for(int i=0;i<=5;i++)
			System.out.println(this.name +" i "+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}