package com.comparable.util;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(3,30,"Jothi"));
		al.add(new Student(1,20,"Jude"));
		al.add(new Student(2,60,"Boomba"));

		Collections.sort(al);
		for(Student s: al)
			System.out.println(s);
	}

}
class Student implements Comparable<Student>{
    int id,age;
	String name;
	@Override
	//public int compareTo(Student str) {
	//	return (this.id - str.id);
	//}
	
	//public int compareTo(Student str) {    // cannot make anther CompareTo function so, we have to move comparator
	//	return this.name.compareTo(str.name);
	//}
	
	public int compareTo(Student str) {
		return (this.age - str.age);
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", age=" + age + ", name=" + name;
	}
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public Student() {
		super();
		
	}
}