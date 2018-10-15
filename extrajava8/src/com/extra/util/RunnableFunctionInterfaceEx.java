package com.extra.util;

public class RunnableFunctionInterfaceEx {

	public static void main(String[] args) {
		Runnable runnable1 = () -> {
			for(int i=0;i<=5;i++)
				System.out.println(" i "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread thread1 = new Thread(runnable1);
		thread1.start();
		
		runnable1 = () -> {
			for(int i=100;i<=110;i++)
				System.out.println(" i "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread thread2 = new Thread(runnable1);
		thread2.start();
		
	}

}