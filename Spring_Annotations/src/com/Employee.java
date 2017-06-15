package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component(value = "emp")
// @Service
// @Repository
// @Controller
public class Employee {

	public Employee() {

		System.out.println("-- Emp Object Created.......");
	}

	@Autowired
	//@Qualifier(value = "dept")
	private Department dept;
	@Autowired
	//@Qualifier(value = "dept1")
	private Department dept1;

	public Department getDept1() {
		return dept1;
	}

	public void setDept1(Department dept1) {
		this.dept1 = dept1;
	}

	private int empId;
	private String empNamne;
	private double salary;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpNamne() {
		return empNamne;
	}

	public void setEmpNamne(String empNamne) {
		this.empNamne = empNamne;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void disp() {
		System.out.println("EMpId: " + empId);
		System.out.println("Name: " + empNamne);
		System.out.println("Salary: " + salary);
		System.out.println("Dept Id: " + dept.getDeptId());
		System.out.println("Dept Name: " + dept.getDeptName());

	}

}
