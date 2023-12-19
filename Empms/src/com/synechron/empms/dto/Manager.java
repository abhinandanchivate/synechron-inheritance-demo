package com.synechron.empms.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Manager extends Employee {
	
	@Override // here we are overriding the method called calculateSalary
	public float calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary()+500.0f;// super : is used to call the base class method.
		// super() is used to call base class constructor.
	}
	// IDC
	
	private String projectName;
	private float projectBudget;
	
	public Manager(String projectName, float projectBudget) {
		this.projectName = projectName;
		this.projectBudget = projectBudget;
		// TODO Auto-generated constructor stub
	}
	
//	public Manager() {
//		// TODO Auto-generated constructor stub
//		// to call super method
//	//	super("ab001","abhi","chivate","pune","1234567899");// super method will help us to call the base class constructor irrespective of type.
//		System.out.println("manager constrctor.");
//	}

}
