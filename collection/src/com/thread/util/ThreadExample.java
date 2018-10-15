package com.thread.util;

public class ThreadExample {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		MyThread mythread1 = new MyThread();
		mythread1.start();
		System.out.println("Done");
		

	}

}

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++)
			System.out.println(this.getName()+ " i "+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}