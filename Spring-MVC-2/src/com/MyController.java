package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/save.htm")
	public void saveData(@RequestParam("empName") String s1, @RequestParam("age") int a1) {
		System.out.println("---- saveData got called.... " + s1 + " and age is " + a1);

	}

	@RequestMapping("/saveEmp.htm")
	public ModelAndView saveData1(@ModelAttribute("e") Employee emp) {

		List<Employee> emps = new ArrayList<Employee>();

		Employee e1 = new Employee(10, "E1", 4555555);
		Employee e2 = new Employee(11, "E2", 564777);
		Employee e3 = new Employee(12, "E3", 2346366);
		Employee e4 = new Employee(13, "E4", 68787869);
		Employee e5 = new Employee(14, "E5", 3646464);

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("Display");
		mav.addObject("empData", emp);

		String[] cities = { "C1", "C2", "C3", "C4", "C5" };
		mav.addObject("myCities", cities);
		mav.addObject("employees", emps);

		return mav;

	}

}
