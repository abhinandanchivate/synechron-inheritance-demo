package com.synechron.empms.repo;

import com.synechron.empms.dto.Employee;

public class EmployeeRepository {
	
	private Employee employees[] = new Employee[10];
	
	private static int counter = -1;
	
	/// we need to implement the Singleton DP. .. 5 mins .
	
	private EmployeeRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private static EmployeeRepository employeeRepository;
	
	// 2. we must have a method called getInstance()==> independent on the object for the execution.
	public static EmployeeRepository getInstance() {
		// local ref : 
		// to hold the object: does it require a ref or not ? ==> yes 
		// shall i declare the local ref or delclare the ref inside the class? ==>  need to share it with 
		// entire application.
		// static methods will access only static variables / refs.==> why
		
		
		if(employeeRepository==null) {
			
			employeeRepository = new EmployeeRepository();
			return employeeRepository;
		}
		else 
			return employeeRepository;
		
		
	}
	
	public String  addEmployee(Employee employee) {
		
		
		if(employees.length>counter) {
			// we will add it towards the end.
			
			employees[++counter] = employee;
			return "success";
			
		}
		else {
			// we will create a new array and then we will shift all old content ===> we will refer it .
			// System.arrayCopy Arrays.copyOf() 
			Employee[] temp = new Employee[employees.length*2];
			
			System.arraycopy(employees, 0, temp, 0, employees.length);
			
			employees= temp;
			return "success";
		}
		
		
	}
	
	// return employee on the basis of id
	
	public Employee getEmployeeById(String id) {
		return null;
	}
	
	// get All employees
	
	public Employee[] getAllEmployees() {
	
		return employees;
	}
	
	// delete 
	
	public void deleteByEmpId(String empId) {
		
	}
	
	public void  deleteAllEmployees() {
		
	}
	// update 
	

}
