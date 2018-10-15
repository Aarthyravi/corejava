package com.example.util;

public class SingletonEx {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
        singleton.count++;
        System.out.println("Count : "+singleton.count);
        Singleton singleton1 = Singleton.getInstance();
        singleton1.count++;
        System.out.println("Count : "+singleton1.count);
	}

}

class Singleton{
	int count;
	
	static Singleton instance;
	
	private Singleton() {
	  count = 0;	
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	
	}
}