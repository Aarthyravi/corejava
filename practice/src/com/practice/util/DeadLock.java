// How to create a deadlock between two threads
package com.practice.util;
 
public class DeadLock {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
 	
    private static class MyThread extends Thread{
        public void run(){
            synchronized(lock1){
            	System.out.println("Thread1 : Holding Lock 1...");
                try {Thread.sleep(10);}
                catch (InterruptedException e){}
                System.out.println("Thread1 : Waiting for lock 2...");
                synchronized(lock2){
                	System.out.println("Thread1 : Holding Lock 1 & Lock 2...");
                }
            }
        }
     }
         
    private static class MyThread1 extends Thread{
        public void run(){
            synchronized(lock1){
            	System.out.println("Thread2 : Holding Lock 1...");
                try {Thread.sleep(10);}
                catch (InterruptedException e){}
                System.out.println("Thread2 : Waiting for lock 2...");
                synchronized(lock2){
                	System.out.println("Thread2 : Holding Lock 1 & Lock 2...");
                }
            }
        }
     } 
    public static void main(String a[]){
        MyThread mythread = new MyThread();
        MyThread1 mythread1 = new MyThread1();
        mythread.start();
        mythread1.start();
    }
}