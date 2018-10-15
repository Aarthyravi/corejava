package com.comparator.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1,40,"Ravi"));
		al.add(new Student(3,30,"Aarthy"));
		al.add(new Student(2,10,"Yog"));
		System.out.println("\nAge Sort");
		Collections.sort(al, new AgeComparator());
		for(Student s: al)
			System.out.println(s);
		System.out.println("\nName Sort");
		Collections.sort(al, new NameComparator());
		for(Student s: al)
			System.out.println(s);
	}

}
class AgeComparator	implements Comparator<Student>{
	@Override
	public int compare(Student student1, Student student2) {

		return (student1.age - student2.age);
	}
}

class NameComparator implements Comparator<Student>{
	@Override
	public int compare(Student student1, Student student2) {

		return student1.name.compareTo(student2.name);
	}
}

class Student{
    int id,age;
	String name;
			
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