package com.thread.util;

public class SynchronizedMethodEx {

	public static void main(String[] args) {
		Greeting greeting = new Greeting();
		MyThread1 mythread1 = new MyThread1(greeting,"Greeting1");
		mythread1.start();
		MyThread1 mythread2 = new MyThread1(greeting,"Greeting2");
		mythread2.start();
		
	}

}

class Greeting{
	public synchronized void display(String name) throws InterruptedException{                       // class level synchronized 
		for(int i=0;i<5;i++) {
			System.out.println("Hello "+name);
			Thread.sleep(1000);
		}
	}
}

class MyThread1 extends Thread{
	Greeting greeting;
	String name;
	public MyThread1(Greeting greeting, String name){
		this.greeting = greeting;
		this.name = name;
	}
    public void run() {
    	try {
    		greeting.display(name);
    	}catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    }
}