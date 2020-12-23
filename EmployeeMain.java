package com.xworkz.inheritance;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee(100, "abc", 878574, 200, 23, "jgjfhr");
		System.out.println(emp.getempId());
		System.out.println(emp.getempName());
		System.out.println(emp.getphone());
		System.out.println(emp.getsalary());
		System.out.println(emp.getage());
		System.out.println(emp.getaddress());
		Employee emp1 = new Employee(101, "cde", 873297, 2000, 23, "ahfdy");
		System.out.println(emp1.getempId());
		System.out.println(emp1.getempName());
		System.out.println(emp1.getphone()); 
		System.out.println(emp1.getsalary());
		System.out.println(emp1.getage());
		System.out.println(emp1.getaddress());

	}

}
