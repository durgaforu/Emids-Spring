package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.emp.service.SaveEmployeeService;

@Controller
public class MyController {

	@Autowired
	private SaveEmployeeService saveEmp;

	@RequestMapping("/saveEmp.htm")
	public void getData(@ModelAttribute("cmdName") Employee emp) {

		saveEmp.saveEmployee(emp);

	}

}
