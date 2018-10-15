package com.oopassignment.util;

public class Employee {

	public static void main(String[] args) {
		Emp e = new Emp();
        e.setEmpNo(1234);
        e.setZipCode(95051);
        e.setExperienceinYears(10);
        e.setBasic(10000);
        e.setHra(3000);
        e.setBonus(15);
        e.setEmpName("Ravi");
        e.setAddress("3244 Lillick");
        e.setPhone(40899345667L);
        e.setState("CA");
        e.setDesignation("Lead");
        e.setEmailAddress("ravi@gmail.com");
        e.display();       
	}

}

class Emp {
	int empNo,zipCode,experienceinYears,basic,hra,bonus;
	long phone;
	String empName,address,State,designation,emailAddress;
	public Emp() {
		super();
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getExperienceinYears() {
		return experienceinYears;
	}
	public void setExperienceinYears(int experienceinYears) {
		this.experienceinYears = experienceinYears;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = this.basic * bonus/100;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getSalary() {
		int totalSalary = this.basic + this.hra +(this.bonus/100*this.basic);
		return totalSalary;
	}
    public void display() {
    	System.out.println("\n\tPrint the Employee Details\n");
    	System.out.println("Name :\t\t"+getEmpName());
    	System.out.println("Designation :\t"+getDesignation());
    	System.out.println("Address :\t"+getAddress()+","+getState()+","+getZipCode());
    	System.out.println("Phone & email : "+getPhone()+","+getEmailAddress());
    	System.out.println("Basic,HRA,Bonus:"+getBasic()+","+getHra()+","+getBonus());
    	System.out.println("Total Salary :  "+getSalary());
  
    } 	
}
	