package com;

import org.springframework.stereotype.Component;

public class Employee {

	private int empId;
	private String emoName;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmoName() {
		return emoName;
	}

	public void setEmoName(String emoName) {
		this.emoName = emoName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
