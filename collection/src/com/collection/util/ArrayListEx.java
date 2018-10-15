package com.collection.util;

import java.util.List;  
import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Employee> listemp = new ArrayList<Employee>(); //  Here 'List' --->Interface type & 'ArrayList' --> Class Type
		Employee e1 = new Employee("Ravi","S/W Engineer",34000);
		Employee e2 = new Employee("Aarthy","Web Developer",12000);
		listemp.add(e1);
		listemp.add(e2);
		System.out.println("Employee Details\n");
		System.out.println(listemp);
		
	}

}

class Employee {
	String name,job;
	int salary;
	public Employee(String name, String job, int salary) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee: name=" + name + ", job=" + job + ", salary=" + salary;
	}
	
}