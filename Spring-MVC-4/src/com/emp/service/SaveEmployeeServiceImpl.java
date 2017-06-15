package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee;
import com.emp.dao.EmployeeDao;

@Service(value = "saveEmpService")
public class SaveEmployeeServiceImpl implements SaveEmployeeService {

	@Autowired
	private EmployeeDao empDao;

	public void saveEmployee(Employee emp) {

		empDao.saveEmployee(emp);

	}

}
