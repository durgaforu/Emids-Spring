package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.service.SaveEmployeeService;

public class Test {
	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp = new Employee();

		emp.setEmoName("James");
		emp.setEmpId(133);
		emp.setSalary(34344);

		SaveEmployeeService saveEmpService = ac.getBean("saveEmpService", SaveEmployeeService.class);

		saveEmpService.saveEmployee(emp);

		ac.registerShutdownHook();

	}

}
