package com.example.util;

public class HasAExample {

	public static void main(String[] args) {
		Address address = new Address("Santa Clara");           //&2000(memory)
		Employee employee = new Employee("Ravi",address);       // &2000 
		System.out.println("address : "+address);
		System.out.println("Employee : "+employee);
		
		address.cityName = "San Jose";
		System.out.println("address : "+address);
		System.out.println("Employee : "+employee);
		
     }
}
class Address {
	String cityName;
    
	public Address() {
		super();
	}
	public Address(String cityName) {
		super();
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + "]";
	}
	
}
class Employee {
	String name;
	Address address;
	public Employee() {
		super();
	}
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;    // &2000
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
}