package com.synechron.empms.service;

import com.synechron.empms.dto.Employee;
import com.synechron.empms.repo.EmployeeRepository;

public class EmployeeService {
	 
	/**
	 * Want to implement Singleton design pattern 1. Write private constructor
	 * 
	 * 2.Must have a method called getInstance which is responsible for creating
	 * singleton object
	 */
	EmployeeRepository emplRepo = EmployeeRepository.getInstance();
 
	private EmployeeService() {
 
	}
 
	private static EmployeeService emplSer;
 
	public static EmployeeService getInstance() {
 
		if (emplSer == null) {
			emplSer = new EmployeeService();
			return emplSer;
		} else {
			return emplSer;
		}
 
	}
	public String addEmployee(Employee employee) {
		// employee should not be null 
		if(employee!=null)
		return emplRepo.addEmployee(employee);
		return "fail";
	}
	public String removeEmployee(Employee employee) {
		return null;
	}
	public Employee[] printAllEmployees() {
		return emplRepo.getAllEmployees();
	}
	public Employee findEmployee(String employeeId) {
		if(!employeeId.equals("")||employeeId!=null) {
		return emplRepo.getEmployeeById(employeeId);}
		else 
			{return null;}
	}
 
}