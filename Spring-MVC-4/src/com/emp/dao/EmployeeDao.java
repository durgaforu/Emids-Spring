package com.emp.dao;

import java.util.List;

import com.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee emp);

	List<Employee> listEmployees();

	Employee findById(int empId);

}