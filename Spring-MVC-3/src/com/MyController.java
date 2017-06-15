package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/getName.htm")
	public ModelAndView getData(@ModelAttribute("e") Employee emp) {
		
		emp.setEmpName("Bucky Wall");
		String cities[]= {"Chn","Ban","Hyd","Delhi","Pune"};

		ModelAndView mav = new ModelAndView();
		mav.setViewName("Form");
		mav.addObject("employee", emp);
	
		mav.addObject("myCities", cities);

		return mav;
	}

}
