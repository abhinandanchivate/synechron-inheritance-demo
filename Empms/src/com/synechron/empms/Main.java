package com.synechron.empms;

import com.synechron.empms.dto.Employee;
import com.synechron.empms.dto.Manager;
import com.synechron.empms.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before manager object");
		Manager manager = new Manager("synechron",123);
		
		float result = manager.calculateSalary();
		System.out.println(result);
		System.out.println("after manager object");
		
		
//		EmployeeService employeeService = EmployeeService.getInstance();
//		
//		
////		String result = employeeService.addEmployee(new Employee("ab001", "abhi", "chivate", "pune", "123456780", 123, 10));
////		
////		System.out.println("result "+result);
//		Employee employee = new Employee("ad001","advik","chivate","pune","1234567890");
//		// every class is directly or indirectly(via parent) inheriting the object class.
//		// object class is called as mother of all classes.
//		// it has all common features required for any class like toString hashcode equals etc.
//		
//		System.out.println(employee);// whenever we will print the ref then it will call toString method internally.
//		System.out.println(employee.toString());
//		System.out.println(employee.equals(null));
//		System.out.println(employee.hashCode());
//		
//		System.out.println(Integer.toHexString(employee.hashCode()));
//		System.out.println(employee.getClass().getName());
//		// inheritance : aquiring the properties and behaviors from one class to other.
//		// how to write inheritance spec ? 
//		// types and impl. ==> 
		
		

	}

}
