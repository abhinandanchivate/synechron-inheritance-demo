package com.synechron.empms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter

public class Employee {
 
	public  float calculateSalary() {
		return this.empSalary + 100.0f;
	}
	
//	// explicit default contstructor
	public Employee() {
		System.out.println("Hello from explicit DC");
		// calling the setter methods inside the constructor
		//this()
		this.setEmpId("ab000");
		this.setEmpFirstName("Abhu");
		this.setEmpLastName("chivate");
		this.setEmpAddress("suneder");
		this.setContactNumber("1234567890");
		this.setEmpSalary(100.0f);
		this.setDeptNo(10);
	}
// 
//	// paramaterised constructor
	public Employee(String empId, String empFirstName, String empLastName, String empAddress, String contactNumber) {
		super();
		this.setEmpId(empId);
		this.setEmpFirstName(empFirstName);
		this.setEmpLastName(empLastName);
		this.setEmpAddress(empAddress);
		this.setContactNumber(contactNumber);
	}
	public Employee(String empId, String empFirstName, String empLastName, String empAddress, String contactNumber,
			float empSalary, int deptNo) {
		//super();
		// constructor chaining. : we will call one constrctor from the same class inside the other constrcutro from the same class.
		this(empId,empFirstName,empLastName,empAddress,contactNumber);// used for constructor chaining.
		this.setEmpSalary(empSalary);
		this.setDeptNo(deptNo);
	}
 
	// empId requires min. length 6
	private String empId;
	// empFirstName requires min. length 2 and max length : 25
	private String empFirstName;
	// emplastName requires min. length 2 and max length : 25
	private String empLastName;
	// empAddress // empFirstName requires min. length 10
	private String empAddress;
	// empAddress // empFirstName requires min. length 10
	private String contactNumber;
	// should be non zero
	private float empSalary;
	// should have non zero value.
	private int deptNo;
 
	public void setEmpId(String empId) {
		if (empId.length() >= 6) {
			this.empId = empId;
		} else {
			System.out.println("Requires an empId of at least 6 characters");
		}
 
	}
 
	public void setEmpFirstName(String empFirstName) {
		if (empFirstName.length() >= 2 && empFirstName.length() <= 25) {
			this.empFirstName = empFirstName;
		} else {
			System.out.println("Requires a first name of at least 2 and at most 25 characters");
		}
 
	}
 
	public void setEmpLastName(String empLastName) {
		if (empLastName.length() >= 2 && empLastName.length() <= 25) {
			this.empLastName = empLastName;
		} else {
			System.out.println("Requires a last name of at least 2 and at most 25 characters");
		}
 
	}
 
	public void setEmpAddress(String empAddress) {
		if (empAddress.length() >= 10) {
			this.empAddress = empAddress;
		} else {
			System.out.println("Requires an address of at least 10 characters");
		}
 
	}
 
	public void setContactNumber(String contactNumber) {
		if (contactNumber.length() >= 10) {
			this.contactNumber = contactNumber;
		} else {
			System.out.println("Requires contact number of at least 10 characters");
		}
 
	}
 
	public void setEmpSalary(float empSalary) {
		if (empSalary > 0) {
			this.empSalary = empSalary;
		} else {
			System.out.println("Requires the salary to be greater than 0");
		}
 
	}
 
	public void setDeptNo(int deptNo) {
		if (deptNo > 0) {
			this.deptNo = deptNo;
		} else {
			System.out.println("Requires the deptNo to be greater than 0");
		}
 
	}
 
}