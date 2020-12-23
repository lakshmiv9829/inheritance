package com.xworkz.inheritance;

final public class Employee {
	final private int empId;
	final private String empName;
	final private long phone;
	final private int salary;
	final private int age;
	final private String address;

	public Employee(int empId, String empName, long phone, int salary, int age, String address) {
		this.empId = 100;
		this.empName = "abc";
		this.phone = phone;
		this.salary = salary;
		this.age = age;
		this.address = address;
	}

	public int getempId() {
		return empId;

	}

	public String getempName() {
		return empName;

	}

	public long getphone() {
		return phone;

	}

	public int getsalary() {
		return salary;

	}

	public int getage() {
		return age;

	}

	public String getaddress() {
		return address;

	}

}
