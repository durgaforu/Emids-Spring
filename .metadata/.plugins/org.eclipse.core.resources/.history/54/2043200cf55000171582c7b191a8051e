package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		System.out.println("--- main started");
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp = ac.getBean("emp", Employee.class);
		Department dept = ac.getBean("dept", Department.class);

		//emp.setDept(dept);

		System.out.println("Id: " + emp.getEmpId());
		System.out.println("Name: " + emp.getEmpNamne());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Dept Id: " + emp.getDept().getDeptId());
		System.out.println("Dept Name: " + emp.getDept().getDeptName());

	}

}
