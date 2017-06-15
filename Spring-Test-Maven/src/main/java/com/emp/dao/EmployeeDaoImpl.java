package com.emp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Employee;

@Repository(value = "empDao")
public class EmployeeDaoImpl implements EmployeeDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.emp.dao.EmployeeDao#saveEmployee(com.Employee)
	 */
	public void saveEmployee(Employee emp) {
		System.out.println(emp.getEmoName() + " Saved to DB");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.emp.dao.EmployeeDao#listEmployees()
	 */
	public List<Employee> listEmployees() {
		return null;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.emp.dao.EmployeeDao#findById(int)
	 */
	public Employee findById(int empId) {

		return null;
	}

}
